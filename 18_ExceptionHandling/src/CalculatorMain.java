public class CalculatorMain {

    public static void main(String[] args)  {


        Calculator calc = new Calculator();

        try {
            double  result = calc.divide(12,0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        ArtihmeticService srv = new ArtihmeticService();
        try {
            srv.doDivision(2,3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("More code to execute..");



    }


}
