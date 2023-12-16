package model;

public class Floor {

    private int floorNo;

    private Flat[] flats;


    public Floor(){}

    public Floor(int floorNo, Flat[] flats) {
        this.floorNo = floorNo;
        this.flats = flats;
    }

    public double getCost(){

        double totalCost = 0;

        for (Flat flat: flats) {
            totalCost+=flat.getCost();
        }

        return totalCost;

    }


    public String getInfo(){

        String retVal = String.format("Floor - No %d, totalCost: %.2f Flats:\n",floorNo,getCost());

        for (Flat flat: flats) {
            retVal+= "\t" +  flat.getInfo() + "\n";
        }

        return retVal;

    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }
}
