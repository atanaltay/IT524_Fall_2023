package model;

public class Chicken extends Animal{

    private String timeToNest;

    public Chicken(String name, int numberOfLegs, String habitat, String gender, String timeToNest) {
        super(name, numberOfLegs, habitat, gender);
        this.timeToNest = timeToNest;
    }

    public String getTimeToNest() {
        return timeToNest;
    }

    public void setTimeToNest(String timeToNest) {
        this.timeToNest = timeToNest;
    }
}
