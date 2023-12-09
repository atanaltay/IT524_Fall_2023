public class HRMain {


    public static void main(String[] args) {

        Address empAddressHome = new Address("ISTANBUL","bagdat","12334");
        Address empAddressWork = new Address("ISTANBUL","fah. ker. gokay","12334");

        Address[] empAddresses = new Address[]{empAddressHome,empAddressWork};

        Employee emp1 = new Employee(100,"ali"
        ,1000,empAddresses);

        Department departmentIT = new Department("IT",
                new Address("ISTANBUL","ccc","23444"),
                emp1);

        emp1.setDepartment(departmentIT);



        Address emp2AddressHome = new Address("ANKARA","esat","2344");
        Address emp2AddressWork = new Address("ANKARA","esat","2344");

        Address[] emp2Addresses = new Address[]{emp2AddressHome,emp2AddressWork};

        Employee emp2 = new Employee(200,"mehmet",2000);
        emp2.setAddresses(emp2Addresses);

        Department departmentSALES = new Department("SALES", new Address("ISTANBUL","ccc","23444"),
                emp2);

        emp2.setDepartment(departmentSALES);


        System.out.println(emp1.printSummary());
        System.out.println(emp2.printSummary());


        System.out.println("-----------DEPARTMENTS----------------");

        System.out.println(departmentIT.printSummary());
        System.out.println(departmentSALES.printSummary());






    }
}
