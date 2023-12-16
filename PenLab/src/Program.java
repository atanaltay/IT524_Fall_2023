public class Program {

	public static void main(String[] args) {
		
		
		Rectangle rectangle = new Rectangle("Red", 100, 20);
		Circle circle = new Circle("Green", 20);

		Pen pen = new Pen();
		
		pen.draw(rectangle);
		pen.draw(circle);

		System.out.println("-------------");
		
		pen.changeColor("blue", circle);
		pen.changeColor("brown", rectangle);
		System.out.println("-------------");
		System.out.println("------NEW COLORS-------");
		pen.draw(rectangle);
		pen.draw(circle);



	}
	
}
