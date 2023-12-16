public class Pen {

	public void draw(Rectangle rectangle)
	{
		System.out.printf("Rectangle: width:%.2f, height:%.2f,color:%s\n",
				rectangle.getWidth(),rectangle.getHeight(),rectangle.getColor());
	}

	public void draw(Circle circle)
	{
		System.out.printf("Circle: radius:%.2f, ,color:%s\n",
				circle.getRadius(),circle.getColor());
	}
	
	
	public void changeColor(String color, Rectangle rect){
		rect.setColor(color);
		System.out.println("Rectangle color changed to  " + rect.getColor());
		
	}

	public void changeColor(String color, Circle circ){
		circ.setColor(color);
		System.out.println("Circle color changed to  " + circ.getColor());

	}

	
}
