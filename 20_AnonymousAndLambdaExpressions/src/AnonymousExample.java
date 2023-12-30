import model.Cat;
import model.Chef;
import model.Chicken;
import model.Eatable;

public class AnonymousExample {

    public static void main(String[] args) {


        Chef chef = new Chef();

        chef.cookFood(new Cat());

        chef.cookFood(new Chicken());

        //Anonymous implementation
        chef.cookSingleMeal(new Eatable(){
            @Override
            public void howToCook() {
                System.out.println("Lamp chops..");
            }
        });

        Eatable myEatable = new Eatable() {
            @Override
            public void howToCook() {
                System.out.println("Turkey firin");
            }

        };


        chef.cookSingleMeal(myEatable);

        chef.cookSingleMeal(()->{

            System.out.println("Double cheese burger.");


        });




    }



}
