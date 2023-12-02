package com.sabanciuniv.main;


import com.sabanciuniv.model.Instructor;

//Pass by value, pass by reference
public class PassByValByRef {

    public static void main(String[] args) {

        int num = 1000;
        System.out.println("Number:" + num);
        ValueChanger valChanger = new ValueChanger();

        //Pass by value
        valChanger.changeValue(num);

        System.out.println("Number: " + num);


        int num2 = 1000;
        System.out.println("Number 2:" + num2);
        num2 = valChanger.changeValue2(num2);

        System.out.println("Number 2:" + num2);


        System.out.println("-----------------");


        Instructor instructor = new Instructor("Jack");

        System.out.println("Instructor name:" + instructor.getName());


        //pass by reference
        valChanger.changeInstructor(instructor);

        System.out.println("Instructor name:" + instructor.getName());








    }

}
