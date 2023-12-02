package com.sabanciuniv.main;

import com.sabanciuniv.model.Employee;

public class MainEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"ahmet",
                "fahri",
                "IT",
                1000,
                0.15);


        System.out.println("Employee name:" + emp1.getName());

        emp1.setName("altug");

        System.out.println("Employee name:" + emp1.getName());

        //Employee empNull = new Employee();

        //System.out.println(empNull.getName());

        System.out.println("Salary:" + emp1.getSalary());
        System.out.println("Net salary" + emp1.getNetSalary());

    }


}
