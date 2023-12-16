package main;

import model.Building;
import model.Flat;
import model.FlatType;
import model.Floor;

public class Program {


    public static void main(String[] args) {


        Flat floor0Studio1 = new Flat(FlatType.STUDIO,2,1);
        Flat floor0Studio2 = new Flat(FlatType.STUDIO,2,2);
        Flat floor0Studio3 = new Flat(FlatType.STUDIO,2,3);

        Flat[] floor0Flats = new Flat[]{floor0Studio1,floor0Studio2,floor0Studio3};

        Floor floor0 = new Floor(0,floor0Flats);


        Flat floor1Apt1 = new Flat(FlatType.APARTMENT,3,4);
        Flat floor1Apt2 = new Flat(FlatType.APARTMENT,3,5);

        Flat[] floor1Flats = new Flat[]{floor1Apt1,floor1Apt2};


        Floor floor1 = new Floor(1,floor1Flats);


        Flat floor2Dup1 = new Flat(FlatType.DUPLEX,5,6);
        Flat floor2Dup2 = new Flat(FlatType.DUPLEX,5,7);

        Flat[] floor2Flats = new Flat[]{floor2Dup1,floor2Dup2};


        Floor floor2 = new Floor(2,floor2Flats);

        Floor[] floors = new Floor[]{floor0,floor1,floor2};

        Building theBuilding = new Building(111,"The streetest",floors);

        System.out.println(theBuilding.getInfo());







    }
}
