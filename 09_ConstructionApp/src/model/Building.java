package model;

public class Building {

    private int buildingNo;
    private String street;

    private Floor[] floors;


    public Building(){}

    public Building(int buildingNo, String street, Floor[] floors) {
        this.buildingNo = buildingNo;
        this.street = street;
        this.floors = floors;
    }

    public String getInfo(){

        String retVal = String.format("Building at %s with no %d,floors: \n",
                street,buildingNo);

        for (Floor floor: floors
             ) {
            retVal+= "\t" + floor.getInfo() + "\n";
        }

        retVal+="--------------\nTOTAL COST: " + getCost();


        return retVal;

    }


    public double getCost(){

        double sum = 0;

        for (Floor floor: floors) {
            sum+=floor.getCost();
        }

        return sum + 1200000;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }
}
