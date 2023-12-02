package com.sabanciuniv.model;

 public class Person {

    private int id;
    private String name;

    protected String protField;

    //default access -> acts like protected
    String city;


    public Person(){
        this.protField = "some value";
        city = "ISTANBUL";
        //Department d = new Department();
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected int getCount(){
        return 12;
    }


    public String getInfo(){


        //String.format
       String retVal = String.format("Name: %s, id: %d",name,id);
       return retVal;
    }



}
