package sol2;

public class Circle extends Shape implements Drawable{

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
