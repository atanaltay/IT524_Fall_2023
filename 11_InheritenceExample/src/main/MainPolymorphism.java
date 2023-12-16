package main;

import model.*;

public class MainPolymorphism {

    public static void main(String[] args) {

        //is-a
        // Animal is a Dog X WRONG
        //Dog is an animal
        //Cat is an Animal
        //HouseCat is an Animal
        //Dog is an Animal
        //HouseCat is a Cat
        //Lion is a Cat

        //Polymorphic Declaration
        Animal myCat = new HouseCat();


        //Cat is not HouseCat: Compiler Error:
        //HouseCat cat = new Cat();

        //May only access Animal accessable
        // fields and methods

        Cat myCat2 = new HouseCat();

        Animal myDog = new Dog();

        Animal chicken1 = new Chicken("dd",
                2,
                "kumes","male","12:00");

        System.out.println(myCat2.getHabitat());

        System.out.println("--------MAKE SOUNDS:--------");

        Animal anim = new Animal();

        Animal myCat3 = new HouseCat();
        Animal myDog2 = new Dog();
        Cat lion2 = new Lion("dd",4,
                "","","",
                "",1000);

        System.out.println("Animal:");
        System.out.println(anim.makeNoise());

        System.out.println("MyCat3:");
        System.out.println(myCat3.makeNoise());

        System.out.println("MyDog2:");
        System.out.println(myDog2.makeNoise());

        System.out.println("---------FEEDING ANIMALS--------");

        ZooKeeper zooKeper = new ZooKeeper();
        zooKeper.feedAnimal(myCat3);
        zooKeper.feedAnimal(myDog2);
        zooKeper.feedAnimal(lion2);



    }





}
