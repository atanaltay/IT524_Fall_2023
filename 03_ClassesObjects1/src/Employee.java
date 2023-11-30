public class Employee {

    int id;
    String name;
    String lastName;
    String department;

    double salary;

    Employee(){
        this.id = 10;
        this.department = "IT";


    }


    //if there is at least one non-default constructor
    // java does not provide the default one.


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, String lastName, String department, double salary) {

        this(id,name);
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
}
