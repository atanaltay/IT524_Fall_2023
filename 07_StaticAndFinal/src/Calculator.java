public class Calculator {

    public final static double PI = 3.14;

    public static double makeSum(double... nums){
        double sum = 0;

        for (double num:nums
             ) {
            sum+=num;
        }

        return sum;
    }
}
