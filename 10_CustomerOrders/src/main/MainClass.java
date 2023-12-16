package main;

import model.Customer;
import model.Order;
import model.OrderItem;
import model.Product;

import java.time.LocalDateTime;

public class MainClass {

    public static void main(String[] args) {

        Product p1 = new Product("TV Samsung",50000,0.2);
        Product p2 = new Product("Laptop Sony",12000,0.2);
        Product p3 = new Product("Mouse Apple",2500,0.2);
        Product p4 = new Product("keyboard Microsoft",1200,0.2);


        OrderItem item1 = new OrderItem(p1,1);
        OrderItem item2 = new OrderItem(p2,1);
        OrderItem item3 = new OrderItem(p3,2);

        Order order = new Order(123,
                new OrderItem[]{item1,item2,item3},
                LocalDateTime.of(2023,1,1,1,1));


        OrderItem item4 = new OrderItem(p4,2);

        Order order2 = new Order(1233,
                new OrderItem[]{item4},
                LocalDateTime.now());


        Customer customer1 = new Customer(1,"Jack",
                new Order[]{order,order2});


        System.out.println(customer1.getInfo());

        ////////////////////////////////////////////

        System.out.println("-------------------------------------");


        OrderItem item11 = new OrderItem(p1,1);
        OrderItem item22 = new OrderItem(p2,1);


        Order order3 = new Order(222,
                new OrderItem[]{item11,item22},
                LocalDateTime.now());


        Customer customer2 = new Customer(2,"Henry",
                new Order[]{order3});


        System.out.println(customer2.getInfo());




    }
}
