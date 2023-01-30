package Practice_Course;


public class Circle {

	private double radius;
	
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle (double R) {
		radius = R;
	}
	
	//Setters
	public void SetRadius(double R) {
		radius = R;
	}
	
	//Getters
	public double GetRadius() {
		double Radius;
		return Radius = ( GetCircumference() ) / ( 2 * (Math.PI) ) ;
	}
	
	public double GetArea() {
		 double Area ;
		return Area = (Math.PI) * (Math.pow(radius, 2));
	}
	
	public double GetCircumference() {
		 double Circum;
		return  Circum = (2) * (Math.PI) * (radius) ;
	}
	
	
	public String toString() {
		
		return ("The Radius is: " + radius);
	}
	
	
	public void display() {
	System.out.println("The Radius is: "+ radius);
	}

	
	
	
}
