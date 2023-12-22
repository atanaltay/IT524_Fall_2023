// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        String test1 = "Jack loves football";

        String[] parts = test1.split(" ");

        for (String part: parts
             ) {
            System.out.println(part);
        }

        //String equality

        String s1 = "Jack loves Java";
        String s2 = "Jack loves Java";

        if(s1==s2){
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }
        System.out.println("-----------------");

        String s3 = new String("Jack loves Java");

        if(s1==s3){
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }


        System.out.println("-------------");
        String s4 = "Jack ";
        String s5 = "loves Java";

        String s6 = s4+s5;
        System.out.println(s1);
        System.out.println(s6);


        if(s1==s6){
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }

        System.out.println("-----------");
        if(s1.equals(s6)){
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }

        /*
        //THis is wrong!
        String s ="";

        for (int i = 0; i < 1000000; i++) {
            s+= " new text";
        }
    */

        StringBuilder builder = new StringBuilder();

        String s ="";

        for (int i = 0; i < 1000; i++) {
           builder.append(" new text ");
        }

        System.out.println(builder);

    }
}