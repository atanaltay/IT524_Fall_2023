import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = null;
        try {


            double result = 13/3;

            sc.nextLine();
            System.out.println("Result is " + result);

        }catch (ArithmeticException ex){
            //ex.printStackTrace();
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("An error occured..");
            ex.printStackTrace();
        }

        finally {
            //Allways execute
            System.out.println("Always execute...");
        }

        System.out.println("More code to execute");




    }
}