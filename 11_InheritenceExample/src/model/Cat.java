package model;

public class Cat extends Animal{

    private String furColor;
    private String favFood;


    public Cat() {
        super();
        System.out.println("---------CAT----------");
    }

    public Cat(String name, int numberOfLegs, String habitat, String gender,String furColor, String favFood){

        super(name,numberOfLegs,habitat,gender);
        this.favFood = favFood;
        this.furColor = furColor;
        System.out.println("-----------CAT CONSTRUCTOR--------------");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
}
