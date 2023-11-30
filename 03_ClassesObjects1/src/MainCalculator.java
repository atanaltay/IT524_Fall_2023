public class MainCalculator {

    public static void main(String[] args) {

        //Instantiate the Calculator

        Calculator calc = new Calculator();
        System.out.println(calc.makeSum(23,45));

        System.out.println(calc.multiply(12,34));

        System.out.println(calc.makeSum(3,4,5,22,3,4));
        System.out.println(calc.makeSum(3,4,5));


    }


}
