public class Conditions2 {

    public static void main(String[] args) {

        int age = 30;
        double salary = 1200;


        //Truth Table
        // AND
        // true and true -> true all others false

        //OR
        // false or false -> false
        //all others true


        if(age<40 && salary<2000){
            System.out.println("Salary less than 2000, age less than 40");
        }else{
            System.out.println("All others");
        }

        if (age>40 || salary<2000){
            System.out.println("Salary less than 2000 OR age greater than 40");
        }

        if(age<40){
            System.out.println("Age is less than 40");
            if(salary<2000){
                System.out.println("Salary less than 2000, age less than 40");
            }
        }



    }



}
