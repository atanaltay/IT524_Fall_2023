import java.util.Scanner;

public class Conditions1 {

    public static void main(String[] args) {

        int age = 30;

        if(age<19){

            System.out.println("The person is a teenager");

        }else {

            System.out.println("The person is not a teenager");
        }


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");


        int number =  input.nextInt();
        int retVal = number;

        if (number<0){
            retVal = number*-1;
        }

        System.out.printf("The absolute value of %d is %d\n",number,retVal);

    }



}
