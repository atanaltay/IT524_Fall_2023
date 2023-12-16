package main;

import model.Animal;
import model.Dog;
import model.HouseCat;
import model.Lion;

public class MainClass2 {

    public static void main(String[] args) {
        System.out.println("---------LION--------");

        Lion lion = new Lion("fearce",4,
                "forest","male",
                "yellow","meat",10000);
        //lion.setMinCalories(10000);
        //lion.setName("Fearce");
        //lion.setHabitat("Forest");
        //lion.setFavFood("Meat");

        System.out.println(lion.getMinCalories());
        System.out.println(lion.getFavFood());
        System.out.println(lion.getName());

        System.out.println("----------------------");


        HouseCat houseCat = new HouseCat();


        System.out.println("---------OVERRIDING----------");


        System.out.println(houseCat.makeNoise());


        Animal animal = new Animal();
        System.out.println(animal.makeNoise());

        System.out.println("-------------------");


        System.out.println(houseCat.makeNoise());

        Dog dog = new Dog();

        System.out.println(dog.makeNoise());



    }
}
