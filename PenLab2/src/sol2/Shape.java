package sol2;

public  class Shape {

    private String color;


    public Shape(String color){
        this.color = color;
    }


    public void changeColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
