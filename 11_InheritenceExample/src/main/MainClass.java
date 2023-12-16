package main;

import model.Animal;
import model.Dog;
import model.HouseCat;
import model.Lion;

public class MainClass {


    public static void main(String[] args) {

        System.out.println("---------ANIMAL--------");
        Animal animal =  new Animal("no name",
                4,
                "no habit","no gender");
        //animal.setName("No name animal");

        System.out.println(animal.getName());

        System.out.println("---------DOG--------");
        //Dog is an Animal
        Dog dog = new Dog("Bobo",4,"anywhere","male","ball","puddle");

        //dog.setSpecies("Puddle"); //Dog
        //dog.setName("Bobo"); //Animal
        //dog.setGender("Male");

        System.out.println(dog.getName());
        System.out.println(dog.getSpecies());

        System.out.println("---------HOUSECat--------");
        HouseCat houseCat1 = new HouseCat("mirmir",4,"house",
                "female","yellow","kuru mama","altug");

        //houseCat1.setFurColor("Yellow");
        //houseCat1.setName("Mirmir");

        //houseCat1.setOwner("Altug");;


        System.out.println(houseCat1.getOwner());



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









    }

}
