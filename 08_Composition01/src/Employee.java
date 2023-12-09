public class Employee {

    private int id;
    private String name;
    private double salary;

    private Address[] addresses;

    private Department department;


    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name, double salary, Address[] address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addresses = address;
    }

    public Employee(int id, String name, double salary, Address[] address, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addresses = address;
        this.department = department;
    }

    public String printSummary(){

        String retVal = String.format("Employee - id:%d, name:%s,salary:%.2f, department:%s\n",
                id,name,salary,department.getName());

        for(Address address:addresses){
            retVal+= "\t" + address.printSummary() + "\n";
        }

        return retVal;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
