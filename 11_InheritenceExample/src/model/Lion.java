package model;

public class Lion extends Cat{

    private int minCalories;

    public Lion(String name, int numberOfLegs,
                String habitat, String gender,
                String furColor, String favFood,
                int minCalories) {
        super(name, numberOfLegs, habitat, gender, furColor, favFood);
        this.minCalories = minCalories;
        System.out.println("-----------LION CONSTRUCTOR--------------");
    }

    public int getMinCalories() {
        return minCalories;
    }

    public void setMinCalories(int minCalories) {
        this.minCalories = minCalories;
    }
}
