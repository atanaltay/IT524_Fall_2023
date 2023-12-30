package model;


public class Dog extends  Animal{


    private int id;
    private String favouriteToy;
    private String species;

    public Dog(){

        super("Deafult",4,"anywhere","Male");
        setName("Default Dog");
        setSpecies("Default species");

    }



    public Dog(String name, int numberOfLegs,
               String habitat, String gender,
               String favouriteToy, String species) {
        super(name, numberOfLegs, habitat, gender);
        this.favouriteToy = favouriteToy;
        this.species = species;
        System.out.println("--------------DOG CONSTRUctor-----------");
    }


    @Override
    public String makeNoise() {
        return "hav hav";
    }

    @Override
    public void getFed() {
        System.out.println("Dog got fed with meat..");
    }


    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
