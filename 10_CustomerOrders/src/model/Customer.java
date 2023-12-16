package model;

public class Customer {

    private int id;
    private String name;
    private Order[] orders;


    public Customer(){

    }


    public double getTotalPrice(){

        double sum = 0;

        for (Order order:
             orders) {
            sum+= order.getTotalPrice();
        }

        return sum;
    }


    public String getInfo(){

        String retVal = "Customer: id:"
                + id
                + ", name: "
                + name + "orders:\n";


        for (Order order:orders
             ) {
            retVal+= order.getInfo() + "\n";
        }

        retVal+="Total spending:" + getTotalPrice();

        return retVal;


    }

    public Customer(int id, String name, Order[] orders) {
        this.id = id;
        this.name = name;
        this.orders = orders;
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

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
}
