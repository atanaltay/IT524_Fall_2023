import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name:");

        String name = sc.next();

        System.out.println("How many sales?");

        int numSales = sc.nextInt();

        double[] sales = new double[numSales];

        for (int i = 0; i < sales.length; i++) {

            System.out.println("Enter sales amount " + (i+1) + ":");
            sales[i] = sc.nextDouble();

        }

        System.out.println("Salary:");
        double salary = sc.nextDouble();

        System.out.println("Commission percentage:");

        double commission = sc.nextDouble();

        System.out.println("Expense:");

        double expenses = sc.nextDouble();

        SalesPerson salesPerson = new SalesPerson(name,salary,commission,expenses,sales);

        System.out.println(salesPerson.printSummary());




    }



}
