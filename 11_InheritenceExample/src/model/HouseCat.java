package model;

public class HouseCat extends Cat{
    private String owner;


    public HouseCat() {
        System.out.println("---------HOUSE CAT----------");
    }


    public HouseCat(String name, int numberOfLegs,
                    String habitat, String gender,
                    String furColor, String favFood,
                    String owner) {
        super(name, numberOfLegs, habitat, gender, furColor, favFood);
        this.owner = owner;
        System.out.println("-----------HOUSECAT CONSTRUCTOR--------------");
    }

    //Method overriding
    public String makeNoise(){
        return "miyaww..";
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
