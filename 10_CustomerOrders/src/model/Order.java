package model;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private OrderItem[] orderItems;
    private LocalDateTime orderDate;

    public Order(){}

    public Order(int id, OrderItem[] orderItems, LocalDateTime orderDate) {
        this.id = id;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
    }


    public double getTotalPrice(){
        double sum = 0;
        for (OrderItem item:
             orderItems) {
            sum+=item.getItemTotalPrice();
        }
        return sum;
    }

    public String getInfo(){

        String retVal = String.format("Order - %d, date: " + orderDate.toString() + ", items:",id);

        for (OrderItem item:
             orderItems) {

            retVal  +="\n"+ item.getInfo();
        }

        retVal+="\nOrder Total:" + getTotalPrice();

        return retVal;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
