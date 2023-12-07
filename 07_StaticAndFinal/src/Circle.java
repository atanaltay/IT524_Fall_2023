import java.time.LocalDateTime;

public class Circle {

    public static double PI = 3.14;

    private double radius;


    public static void informAboutDate(){

        System.out.println("Current date is " +  LocalDateTime.now());

        //Compiler error
        //System.out.println(calculateArea());

        //Compiler error
        //System.out.println("Radius is " + radius);



    }


    public double calculateArea(){
        return PI*radius*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
