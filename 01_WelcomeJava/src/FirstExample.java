public class FirstExample
{
    public static void main(String[] args) {
        System.out.println("First example....");

        //A comment line

        /*
        * multi line comments
        *
        *
        * */

        //Primitive Types
        int num1 = 234;

        double salary = 1234.23;


        System.out.println("Num1:"+ num1);
        System.out.println("Salary:" + salary);


        char c1 = 'a';

        System.out.println("C1:" + c1);

        byte b1 = 100;

        boolean isOld = true;

        String welcome = "Welcome to java";

        System.out.println(welcome);

        int x1 = 123;
        int x2 = 345;

        int sum = x1+x2;

        System.out.println("X1:" + x1 + ", x2:" + x2 + " sum:" + sum);

        // int -> %d
        // String -> %s
        // double -> %f
        System.out.printf("x1 : %d, x2:%d, sum: %d\n",x1,x2,sum);
        System.out.printf("x1 : %d, x2:%d, sum: %d\n",x1,x2,sum);

        int x = 100;
        int z = x++; //post increment

        System.out.println(x);
        System.out.println(z);

        int c = ++x;
        System.out.println(x);
        System.out.println(c);

        x++; // => x+=1


        double balance = 1234.236555;

        System.out.printf("balance is : %.2f",balance);



    }


}
