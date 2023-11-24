import java.util.Scanner;

public class ConsoleInputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?");

        String name =  sc.nextLine();

        System.out.println("Welcome " + name);

        int num1 = 100;
        int num2 = 150;

        System.out.println(num1>num2);





    }


}
