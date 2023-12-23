import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        System.out.println("Size:" + names.size());

        names.add("ali");
        names.add("veli");
        names.add("osman");
        names.add("hayri");

        System.out.println("Size after:" + names.size());

        System.out.println("Element at 0:" + names.get(0));

        names.remove(2);

        System.out.println("Element at 2:" + names.get(2));

        System.out.println("---------------");

        for (String name: names) {
            System.out.println(name);
        }


        for (int i = 0; i < names.size(); i++) {

            System.out.println(names.get(i));

        }

        System.out.println("--------------");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        for (int num: numbers
             ) {
            System.out.println(num);
        }

        System.out.println("-------------------------");

        List<Person> people = new ArrayList<>();
        people.add(new Person(1,"jack"));
        people.add(new Person(2,"henry"));
        people.add(new Person(3,"william"));
        people.add(new Person(4,"james"));


        for (Person p: people
             ) {
            System.out.println(p);
        }


        System.out.println("----------------");


        List<Person> data = new ArrayList<>();
        data.add(new Person(1,"jack"));
        data.add(new Person(2,"henry"));

        Department dept = new Department("IT",data);

        dept.getPeople().add(new Person(3,"william"));
        dept.getPeople().add(new Person(4,"james"));

        Person p5 = new Person(5,"John");

        dept.getPeople().add(p5);
        dept.getPeople().add(p5);

        System.out.println(dept.getPeople().get(4)==dept.getPeople().get(5));


        p5.setName("Osman");


        System.out.println(dept.getPeople().get(4));
        System.out.println(dept.getPeople().get(5));


        System.out.println("-----------------");

        for (Person person: dept.getPeople()
             ) {
            System.out.println(person);
        }


    }




}
