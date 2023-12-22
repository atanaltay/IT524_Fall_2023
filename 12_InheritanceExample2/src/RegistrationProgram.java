import model.*;

public class RegistrationProgram {

    public static void main(String[] args) {

        Teacher mathTeacher = new Teacher(1,"Jack Johns",
                "ANKARA","Mathematics",new
                String[]{"MATH","ALGEBRA","LINEAR ALGEBRA"});

        System.out.println(mathTeacher);


        Student stu1 = new Student(1,"Henry","ISTANBUL","MATH",
                new String[]{"MATH","HISTORY"});

        Object o1 = new Student(1,"Henry","ISTANBUL","MATH",
                new String[]{"MATH","HISTORY"});


        System.out.println(o1);
        System.out.println(stu1);

        GradStudent gradStudent = new GradStudent(20,"Jennyfer","ISTANBUL"
        , "MATH",new String[]{"MATH","LINEAR ALGEBRA"},"Big Data");


        Director director = new Director();

        director.hire(mathTeacher);

        System.out.println("------------");

        director.hire(stu1);


        Person p1 = new Person(1,"Jack Johns","Ankara","Pol Science");

        director.hire(p1);



    }


}
