public class ConditionsDecision {

    public static void main(String[] args) {

        double salary = 1250;
        int age = 34;

        // if -  else if - else
        if(salary<1000){
            System.out.println("less than 1000");
        } else if (salary<2000) {
            System.out.println("1000 - 2000");
        } else if (salary<3000) {
            System.out.println("2000 - 3000");
        }else {

            System.out.println("Over 3000");

        }

        if(salary>1000) System.out.println("Salary over 1000");
        else System.out.println("Salary less than 1000");



        switch (age){

            case 30:
                System.out.println("Age is 30");
                break;
            case 40:
                System.out.println("Age is 40");
                break;

            default:
                System.out.println("Age is NOT 30 OR 40");


        }





    }




}
