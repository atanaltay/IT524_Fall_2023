package model;

public class Chef {

    public void cookFood(Animal anim){
        if(anim instanceof Eatable){
            ((Eatable)anim).howToCook();
        }else{
            System.out.println("Cannot cook that");
        }


    }

    public void cookSingleMeal(Eatable eatable){

        eatable.howToCook();

    }


}
