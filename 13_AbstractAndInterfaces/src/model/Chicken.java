package model;

public class Chicken extends Animal implements Eatable{
    @Override
    public String makeNoise() {
       return "git git git";
    }

    @Override
    public void getFed() {
        System.out.println("Chicken got fed..");
    }

    @Override
    public void howToCook() {
        System.out.println("Cook chicken soup..");
    }
}
