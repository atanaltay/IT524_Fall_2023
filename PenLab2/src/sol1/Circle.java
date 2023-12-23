package sol1;

public class Circle extends Shape{

	private double radius;


	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public void draw() {
		System.out.println("Circle, radius: " + radius);
	}
}
