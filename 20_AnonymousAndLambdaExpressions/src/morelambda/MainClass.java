package morelambda;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainClass {


    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("ali");
        data.add("jack");
        data.add("veli");
        data.add("osman");
        data.add("william");
        data.add("jenny");
        data.add("ayse");


        for (String str:data
             ) {
            System.out.println(str);
        }

        System.out.println("------------");


        //Stream coding
        //Consumer
        //Predicate
        //Supplier
        //Function
        System.out.println("---ALL----");
        data.forEach(s-> System.out.println(s));

        System.out.println("---starts with----");
        data.stream().filter(s->s.startsWith("j"))
                .forEach(s-> System.out.println(s));


        System.out.println("------------");

        Person p1 = new Person(10,"John");
        Person p2 = new Person(22,"Henry");
        Person p3 = new Person(33,"William");
        Person p4 = new Person(4,"Jack");
        Person p5 = new Person(5,"Osman");
        Person p6 = new Person(66,"Hasan");
        Person p7 = new Person(6,"Hasan");
        Person p8 = new Person(6,"Hasan");

        List<Person> personList = new ArrayList<>();

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);
        personList.add(p8);

        personList.stream().filter(p-> p.getName().equals("Hasan"))
                .forEach(p-> System.out.println(p));


        System.out.println("--------------");

        /*
        TreeSet<Person> sortedPeople = new TreeSet<>(
                (o1,o2)-> Integer.valueOf(o1.getId()).compareTo(o2.getId())
        );
        */
        TreeSet<Person> sortedPeople = new TreeSet<>(
                (o1,o2)-> o1.getName().compareTo(o2.getName())
        );

        sortedPeople.add(p1);
        sortedPeople.add(p2);
        sortedPeople.add(p3);
        sortedPeople.add(p4);
        sortedPeople.add(p5);
        sortedPeople.add(p6);
        sortedPeople.add(p7);
        sortedPeople.add(p8);
        sortedPeople.add(p8);


        sortedPeople.forEach(p-> System.out.println(p));





    }






}
