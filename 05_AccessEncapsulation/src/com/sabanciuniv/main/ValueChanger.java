package com.sabanciuniv.main;

import com.sabanciuniv.model.Instructor;

public class ValueChanger {

    public void changeValue(int x){
        x+=100;
        System.out.println("changeValue:" + x);
    }


    public int changeValue2(int x){
        x= x+100;
        return x;
    }


    public void changeInstructor(Instructor instructor){

        instructor.setName("no name");

    }

}
