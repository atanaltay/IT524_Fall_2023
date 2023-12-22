import model.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how

        //Compiler error
        //cannot create objects from abstract classes
        //Animal anim = new Animal();

        Dog dog1 = new Dog("Bobo",4,"anywhere","male","ball","puddle");

        Cat houseCat1 = new Cat("mirmir",4,"house",
                "female","yellow","kuru mama");

        Dog dog2 = new Dog("Jojo",4,"anywhere","male","ball","puddle");

        Cat houseCat2 = new Cat("sarman",4,"house",
                "female","yellow","kuru mama");


        Monkey monkey = new Monkey();

        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.feedAnimals(new Animal[]{dog1,dog2,houseCat2,houseCat1,monkey});

        Duck duck = new Duck();
        Chicken chicken = new Chicken();

        Chef chef = new Chef();

        chef.cookFood(duck);
        chef.cookFood(chicken);
        chef.cookFood(monkey);


    }
}