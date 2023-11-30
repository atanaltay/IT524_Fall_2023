public class PrimitiveTypeCasting {


    public static void main(String[] args) {


        int i = 30; //32 bits

        //implicit type casting
        //from int to long
        long l1 = i; //64 bits

        double d1 = 12.6;
        double d2 = 23.7;

        //if such explicit cast occurs, precision is lost
        int i1 = (int)d1;
        int i2 = (int)d2;
        System.out.printf("i1 : %d, i2 %d \n",i1,i2);

        byte b1 = 10;
        byte b2 = 20;

        //Any int sized or smaller value is
        //always int for java.
        //Compiler error:
        //byte byteSum = b1+b2;

        byte byteSum = (byte)(b1+b2);

        short s1 = 200;
        short s2 = 300;

        short sss = 200+300;


        //Compiler error:
        //short sSum = s1+s2;

        short sSum = (short)(s1+s2);


        //String casting

        int number = 345;

        //Wrapper types int-> Integer
        // boolean -> Boolean
        //double -> Double

        String strNumber = String.valueOf(number);

        String balance = "2345.33";

        double balance1 = Double.parseDouble(balance);

        double balance2 = Double.valueOf(balance);

        String anIntStr = "23";

        //int anInt = Integer.parseInt("aaa");


        int anInt2 = Integer.valueOf("aaa");




    }




}
