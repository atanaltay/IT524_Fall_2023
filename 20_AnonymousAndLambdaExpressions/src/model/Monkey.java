package model;

public class Monkey extends Animal{


    @Override
    public String makeNoise() {
        return "viavvvia";
    }

    @Override
    public void getFed() {
        System.out.println("Monkey ate bananas");
    }
}
