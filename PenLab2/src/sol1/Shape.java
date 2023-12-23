package sol1;

public abstract class Shape {

    private String color;


    public Shape(String color){
        this.color = color;
    }

    public abstract void draw();

    public void changeColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
