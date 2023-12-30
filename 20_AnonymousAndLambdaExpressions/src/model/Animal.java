package model;

public abstract class Animal {

    private String name;
    private int numberOfLegs;
    private String habitat;
    private String gender;

    public Animal() {
        System.out.println("---------ANIMAL----------");
    }

    public Animal(String name, int numberOfLegs, String habitat, String gender) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.habitat = habitat;
        this.gender = gender;
        System.out.println("--------Animal Constructor--------------");
    }


    public abstract String makeNoise();

    public abstract void getFed();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
