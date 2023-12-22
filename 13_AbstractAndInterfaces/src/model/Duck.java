package model;

public class Duck extends Animal implements Eatable{
    @Override
    public String makeNoise() {
       return "vak vak";
    }

    @Override
    public void getFed() {
        System.out.println("Duck got fed..");
    }

    @Override
    public void howToCook() {
        System.out.println("Roast the duck");
    }
}
