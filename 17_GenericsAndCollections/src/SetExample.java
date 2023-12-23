import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {


    public static void main(String[] args) {


        Set<String> namesSet = new HashSet<>();
        namesSet.add("osman");
        namesSet.add("ali");
        namesSet.add("jack");
        namesSet.add("william");
        namesSet.add("henry");
        namesSet.add("osman");
        namesSet.add("osman");
        namesSet.add("jack");
        namesSet.add("jack");

        for (String name: namesSet
             ) {
            System.out.println(name);
        }


        System.out.println("-------------");

        Person p1 = new Person(10,"John");
        Person p2 = new Person(22,"Henry");
        Person p3 = new Person(33,"William");
        Person p4 = new Person(4,"Jack");
        Person p5 = new Person(5,"Osman");
        Person p6 = new Person(66,"Hasan");
        Person p7 = new Person(6,"Hasan");
        Person p8 = new Person(6,"Hasan");

        Set<Person> personSet = new HashSet<>();

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);
        personSet.add(p6);
        personSet.add(p7);
        personSet.add(p8);
        personSet.add(p8);

        for (Person person:personSet
             ) {
            System.out.println(person);
        }


        System.out.println("------------------");

        Set<String> sortedNames = new TreeSet<>();
        sortedNames.add("osman");
        sortedNames.add("ali");
        sortedNames.add("jack");
        sortedNames.add("william");
        sortedNames.add("henry");
        sortedNames.add("osman");
        sortedNames.add("osman");
        sortedNames.add("jack");
        sortedNames.add("jack");


        for (String name: sortedNames
             ) {
            System.out.println(name);
        }


        System.out.println("--------------------");


        Set<Person> sortedPeople = new TreeSet<>();

        sortedPeople.add(p1);
        sortedPeople.add(p2);
        sortedPeople.add(p3);
        sortedPeople.add(p4);
        sortedPeople.add(p5);
        sortedPeople.add(p6);
        sortedPeople.add(p7);
        sortedPeople.add(p8);
        sortedPeople.add(p8);

        for (Person person:sortedPeople){
            System.out.println(person);
        }

        System.out.println("-------------------------");


        Set<Person> sortedPeople2 = new TreeSet<>(new PersonIDComparator());

        sortedPeople2.add(p1);
        sortedPeople2.add(p2);
        sortedPeople2.add(p3);
        sortedPeople2.add(p4);
        sortedPeople2.add(p5);
        sortedPeople2.add(p6);
        sortedPeople2.add(p7);
        sortedPeople2.add(p8);
        sortedPeople2.add(p8);

        for (Person person:sortedPeople2){
            System.out.println(person);
        }



    }



}
