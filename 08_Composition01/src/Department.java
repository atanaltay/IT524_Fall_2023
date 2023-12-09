public class Department {
    private String name;
    private Address address;

    private Employee manager;

    public Department() {
    }

    public Department(String name, Address address, Employee manager) {
        this.name = name;
        this.address = address;
        this.manager = manager;
    }

    public String printSummary(){

        String retVal = String.format("Department - name:%s\n",name);

        retVal += address.printSummary();

        retVal  +="Manager: " + manager.printSummary();

        return retVal;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
