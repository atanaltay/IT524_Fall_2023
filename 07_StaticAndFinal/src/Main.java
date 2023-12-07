import java.time.LocalDateTime;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(Circle.PI);

        Circle.informAboutDate();




        Circle circle = new Circle();
        circle.setRadius(2);

        System.out.println("Area: " + circle.calculateArea());

        Plane plane1 = new Plane("ISTANBUL", LocalDateTime.of(2023,12,2,12,0));

        Plane plane2 = new Plane("ISTANBUL", LocalDateTime.of(2023,12,3,12,0));

        Plane plane3 = new Plane("ISTANBUL", LocalDateTime.of(2023,12,4,12,0));


        System.out.println("Number of plane instances: " + plane3.count);


        //Code a class such that only one instance can be created at compile and run time.
        //hint : instance must be accessed through a method.
        //Example: Plane.getInstance()->Plane instance


       // MySingleType mySingle = new MySingleType();

        MySingleType type1 = MySingleType.getInstance();

        type1.setName("altug");


        MySingleType type2 = MySingleType.getInstance();

        System.out.println("Name:" + type2.getName());


        System.out.println("Sum is " + Calculator.makeSum(3,4,5));

        //Compiler error, final fields cannot be assigned!
        //Calculator.PI = 20;

        //Math.PI = 10;

    }
}