//Java Bean
//POJO: Plain Old Java Object
public class Rectangle{

	private double width;
	private double height;

	private String color;
	
	public Rectangle(String color, int width, int height) {
		this.color = color;
		this.width = width;
		this.height = height;
	}
	


	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
