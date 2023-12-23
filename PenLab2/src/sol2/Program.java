package sol2;

public class Program {

	public static void main(String[] args) {
		
		
		Rectangle rectangle = new Rectangle("Red", 100, 20);
		Circle circle = new Circle("Green", 20);

		Pen pen = new Pen();
		
		pen.drawShape(rectangle);
		pen.drawShape(circle);

		System.out.println("-------------");
		
		pen.changeColor(rectangle,"blue");
		pen.changeColor(circle,"red");
		System.out.println("-------------");
		System.out.println("------NEW COLORS-------");
		System.out.println(rectangle.getColor());
		System.out.println(circle.getColor());



	}
	
}
