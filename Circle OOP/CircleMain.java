package Practice_Course;

public class CircleMain {

public class TestDriver {

	public static void main(String[] args) {

		Circle C1 = new Circle ();
		
		C1.SetRadius(4);
		C1.display();
		System.out.println(C1.toString());
		System.out.println("=========================");
		
		System.out.println("The Radius is : " + C1.GetRadius() );
		System.out.println("The Area is : " + C1.GetArea() );
		System.out.println("The Circum is: " + C1.GetCircumference() );
		System.out.println("=========================");
		
		Circle C2 = new Circle (25.5);
		C2.display();
		System.out.println(C2.toString());
		System.out.println(C2.toString());
		System.out.println("The Area is : " + C2.GetArea() );
		System.out.println("The Circum is: " + C2.GetCircumference() );
		
	}

}


}
