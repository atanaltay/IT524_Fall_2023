public class SalesPerson {

    private String name;
    private double monthlySalary;
    private double commisson;
    private double totalExpense;
    private double[] sales;


    public SalesPerson(String name, double monthlySalary,
                       double commisson, double totalExpense, double[] sales) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.commisson = commisson;
        this.totalExpense = totalExpense;
        this.sales = sales;
    }

    //Methods

    public double getTotalSales()
    {
        double total = 0;

        for (double sale:sales) {
            total+=sale;
        }

        return total;
    }

    public double getAvarageSales(){

        if(sales!=null){
            return getTotalSales()/sales.length;
        }
       return 0;
    }

    public double getTotalCommission(){
        if(sales!=null){
            return getTotalSales()*commisson;
        }

        return 0;
    }


    public double getTotalAmountToPay(){

        return monthlySalary+getTotalCommission()+totalExpense;

    }

    public String printSummary(){

       return String.format("Total Sales:%.2f\nCommission:%.2f\n"+
                "AvarageSales:%.2f\nSalary:%.2f\nTotal Expense:%.2f\n"+
               "Total to be paid:%.2f",getTotalSales(),getTotalCommission(),
               getAvarageSales(),monthlySalary,totalExpense,getTotalAmountToPay());


    }


    //Setters & Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getCommisson() {
        return commisson;
    }

    public void setCommisson(double commisson) {
        this.commisson = commisson;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double[] getSales() {
        return sales;
    }

    public void setSales(double[] sales) {
        this.sales = sales;
    }
}
