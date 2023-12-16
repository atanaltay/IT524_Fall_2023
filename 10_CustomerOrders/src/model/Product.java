package model;

public class Product {

    //name, price, tax

    private String name;
    private double price;
    private double tax;

    public Product(){
    }




    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double getTotalPrice(){
        return price + price*tax;
    }

    public String getInfo(){

        return String.format("Product: %s, price: %.2f, tax: %.2f, total:%.2f",
                name,price,tax,getTotalPrice());

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
