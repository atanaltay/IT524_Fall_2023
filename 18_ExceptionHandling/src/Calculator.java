public class Calculator {

    public double divide(double x1, double x2) throws Exception{

        if(x2==0){
            throw new Exception("Second number cannot be zero");
        }

        double result = x1/x2;


        return result;

    }



}
