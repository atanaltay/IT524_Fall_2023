package com.sabanciuniv.model;

public class Employee {

    private int id;
    private String name;
    private String lastName;
    private String department;
    private double salary;
    private double tax;

    public Employee(){

    }

    public Employee(int id, String name, String lastName, String department, double salary, double tax) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.tax = tax;
    }

    //getter

    public double getNetSalary(){

        return salary - (salary*tax);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
