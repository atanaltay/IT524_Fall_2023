import java.util.Random;

public class MainClass {


    public static void main(String[] args) {

        //Reference type initialization

        Car familyCar = new Car();
        System.out.println("Family Car:");
        System.out.println("Color:" + familyCar.color);
        System.out.println("Transmission:" + familyCar.transmission);
        System.out.println("Current speed:" + familyCar.currentSpeed);

        familyCar.color = "Red";

        System.out.println("Color:" + familyCar.color);


        Car sportsCar = new Car();
        System.out.println("Sports Car");
        System.out.println("Color:" + sportsCar.color);
        System.out.println("Transmission:" + sportsCar.transmission);
        System.out.println("Current speed:" + sportsCar.currentSpeed);

        sportsCar.increaseSpeed(20);

        sportsCar.startEngine();
        sportsCar.increaseSpeed(20);

        sportsCar.increaseSpeed(60);

        sportsCar.decreaseSpeed(30);
        sportsCar.decreaseSpeed(20);

        sportsCar.stopEngine();

        System.out.println("-----------------------------------");

        Car myCar = new Car("gray","manual");

        myCar.startEngine();
        myCar.increaseSpeed(100);

        System.out.println(myCar.getInfo());


    }

}
