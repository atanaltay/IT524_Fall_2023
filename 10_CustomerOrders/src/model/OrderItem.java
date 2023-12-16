package model;

public class OrderItem {

    private  Product product;
    private int amount;

    public OrderItem(){}

    public OrderItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public double getItemTotalPrice(){

        return product.getTotalPrice()*amount;

    }

    public String getInfo(){

       String retVal = "Order Item: ";
       retVal += product.getInfo();
       retVal +=" , total: " + getItemTotalPrice();

        return retVal;

    }




    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
