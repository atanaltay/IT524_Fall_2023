package model;

public class Director {


    public void hire(Person p){
        if (p instanceof  Teacher){
            ((Teacher)p).getHired();
        }else{
            System.out.println(p.getClass().getName()
                    + " cannot be hired.");
        }


    }



}
