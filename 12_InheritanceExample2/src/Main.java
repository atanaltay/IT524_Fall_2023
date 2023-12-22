// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/*Student Registration System
-------------------------------

- Student, Teacher, GradStudents, Director
- Everyone:
	- has an address
	- id
	- name
	- faculty

- All Teachers
	- courses offered

-All Students:
	- Registered courses

- GradStudent (is a Student)
	- thesis subject

- Director may hire / fire Teachers
- Director may register / unregister students
* */


import model.Cat;
import model.Person;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1,"Jack Johns","Ankara","Pol Science");
        //println is a polymorphic method, calls toString() of Object Type
        System.out.println(p1);

        Person p2 = new Person(1,"Jack Johns","Ankara","Pol Science");

        if(p1 == p2){
            System.out.println("p1 is equal to p2");
        }else{
            System.out.println("NOT EQUAL");
        }

        Person p3 = p2;

        if(p3 == p2){
            System.out.println("p3 is equal to p2");
        }else{
            System.out.println("NOT EQUAL");
        }


        if(p1.equals(p2)){
            System.out.println("EQUALS OUTPUT: EQUAL");
        }else{
            System.out.println("EQUALS OUTPUT: NOT EQUAL");
        }


        Cat cat1 = new Cat();

        if(p1.equals(cat1)){
            System.out.println("P1 and Cat are equal");
        }else{
            System.out.println("P1 and Cat are NOT equal");
        }

    }
}