public class Car {

    //instance variables //fields //global variables
    // these define the state of the
    // object from this class

    String color;
    String transmission;

    int currentSpeed;

    boolean engineStarted;


    // access returntype methodname(params){method body}
    //methodname(params) -> method signature


    //A constructor without any parameters is called
    // the DEFAULT CONSTRUCTOR
    Car(){
        color = "Blue";
        transmission = "Auto";

    }

    //Non-default constructor
    //Constructor overloading
    Car(String _color, String _transmission){
        color = _color;
        transmission = _transmission;
    }


    void startEngine(){
        if(!engineStarted) {
            engineStarted = true;
            System.out.println("Engine started");
        }
    }

    void increaseSpeed(int speed){

        if(engineStarted){
            currentSpeed = speed;
            System.out.println("Car's current speed increased to "
                    + currentSpeed);
        }else{
            System.out.println("Start the engine first!");
        }

    }

    void decreaseSpeed(int speed){
        if(engineStarted && currentSpeed>speed){
            currentSpeed -= speed;
            System.out.println("Car's current speed decreased to "
                    + currentSpeed);
        }else{
            System.out.println("Engine stopped or speed is higher than current speed!");
        }

    }



    void stopEngine(){
        if(engineStarted){

            engineStarted = false;
            System.out.println("Engine stopped");

        }
    }

    public String getInfo(){
        String retVal = "Car color:" + color +
                ", speed:" + currentSpeed +
                ", transmission:" + transmission +
                ", engine started:" + engineStarted;

        return retVal;

    }


}
