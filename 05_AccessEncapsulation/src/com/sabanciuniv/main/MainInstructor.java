package com.sabanciuniv.main;

import com.sabanciuniv.model.Instructor;

public class MainInstructor {

    public static void main(String[] args) {

        String[] courses = new String[]{"Math","Algebra","Non-linear modelling"};

        Instructor instructor1 =
                new Instructor("Jack","Math","FENS",courses);

        System.out.println("--------INST 1------------");
        System.out.println(instructor1.getInfo());



        Instructor instructor2= new Instructor("Henry","Philosophy","FASS");
        System.out.println("--------INST 2------------");
        System.out.println(instructor2.getInfo());

        String[] courses2 = new String[]{"History","Sociology"};


        instructor2.setCourses(courses2);
        System.out.println("--------INST 2 after courses------------");
        System.out.println(instructor2.getInfo());


    }


}
