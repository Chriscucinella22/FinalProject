package model;


import java.io.Serializable;


public abstract class Boat implements Serializable {
    public abstract String displayInfo();


    public double getExpenses() {
        return maintenanceExpenses;  // Return the total maintenance expenses
    }


    public enum BoatType {
        SAILING, POWER
    }


    protected BoatType type;
    protected String name;
    protected int yearManufacture;
    protected String makeModel;
    protected int length;
    protected double purchasePrice;
    protected double maintenanceExpenses;


    public Boat(BoatType type, String name, int yearManufacture, String makeModel, int length, double purchasePrice) {
        this.type = type;
        this.name = name;
        this.yearManufacture = yearManufacture;
        this.makeModel = makeModel;
        this.length = length;
        this.purchasePrice = purchasePrice;
        this.maintenanceExpenses = 0.0;  // Initialize with 0.0 expense
    }


    public BoatType getType() { return type; }
    public String getName() { return name; }
    public int getYearManufacture() { return yearManufacture; }
    public String getMakeModel() { return makeModel; }
    public int getLength() { return length; }
    public double getPurchasePrice() { return purchasePrice; }
    public double getMaintenanceExpenses() { return maintenanceExpenses; }


    public void addExpense(double amount) {
        this.maintenanceExpenses += amount;  // Increment the maintenance expense
    }


    @Override
    public String toString() {
        return String.format("%-8s %-20s %4d %-10s %3d' : Paid $ %8.2f : Spent $ %8.2f",
                type, name, yearManufacture, makeModel, length, purchasePrice, maintenanceExpenses);
    }
}
