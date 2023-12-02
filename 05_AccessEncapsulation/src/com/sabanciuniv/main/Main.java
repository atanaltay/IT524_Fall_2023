package com.sabanciuniv.main;

import com.sabanciuniv.model.*;


import com.sabanciuniv.model.Person;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Department is defined withg default access
        //we cannot access Depoartment in main package
        //Department department = new Department();
        Person p = new Person();


        System.out.println(p.getInfo());


        //protected fields are not accessable from other packages
        //System.out.println(p.protField);

        //System.out.println(p.getCount());

        //default  access works like protected
       //p.city




        //com.sabanciuniv.model.Person p = new Person();



    }
}