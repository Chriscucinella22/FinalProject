package model;


public class SailingBoat extends Boat {
    public SailingBoat(String name, int yearManufacture, String makeModel, int length, double purchasePrice) {
        super(BoatType.SAILING, name, yearManufacture, makeModel, length, purchasePrice);
    }


    @Override
    public String displayInfo() {
        return String.format("SAILING %-20s %d %-10s %2d' : Paid $ %8.2f : Spent $ %8.2f",
                getName(), getYearManufacture(), getMakeModel(), getLength(), getPurchasePrice(), getExpenses());
    }
}

