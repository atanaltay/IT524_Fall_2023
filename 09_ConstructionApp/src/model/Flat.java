package model;

public class Flat {

    private FlatType flatType;
    private int numberOfRooms;
    private int doorNo;

    public Flat(){

    }


    public Flat(FlatType flatType, int numberOfRooms, int doorNo) {
        this.flatType = flatType;
        this.numberOfRooms = numberOfRooms;
        this.doorNo = doorNo;
    }

    public double getCost(){

        if(flatType==FlatType.STUDIO){
            return 300000;
        } else if (flatType==FlatType.APARTMENT) {
            return 500000;
        }else{
            return 1200000;
        }

    }

    public String getInfo(){

        return String.format("Flat - type " + flatType + ", num rooms: %d, Door No: %d, cost is %.2f",
                numberOfRooms,doorNo,getCost());


    }



    public FlatType getFlatType() {
        return flatType;
    }

    public void setFlatType(FlatType flatType) {
        this.flatType = flatType;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
}
