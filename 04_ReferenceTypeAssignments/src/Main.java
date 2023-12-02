// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Primitive type assignments
        //value is copied!
        int x = 30;
        int y = x;

        x+=100;

        System.out.printf("x: %d\n",x);
        System.out.printf("y: %d\n",y);


        Person p1 = new Person(1,"altug");
        Person p2 = new Person(2,"metin");
        Person p3 = new Person(3,"ahmet");


        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());

        System.out.println("------------------");

        //Reference type assignment
        //reference is copied!
        Person p4 = new Person(100,"gokhan");

        p4 = p1;

        p1.name = "Jack";

        System.out.println(p1.getInfo());

        System.out.println(p4.getInfo());





    }
}