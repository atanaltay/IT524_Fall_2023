import java.util.Scanner;

public class CreditRating {

    public static void main(String[] args) {

        System.out.println("What's your credit rating? Excellent:1 / Fair: 0");
        Scanner sc = new Scanner(System.in);
        int creditRating = sc.nextInt();

        if(creditRating==0){
            System.out.println("Fair");
        }else{
            System.out.println("Excellent");
        }







    }




}
