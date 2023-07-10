package Lab06;

public class Product {
//We Create Products That has a name & Price
	
	private String name;
	private double Price;
	
	//Default Constructor with 2 Parameters
	public Product (String nn, double pp) {
		name = nn;
		Price = pp;
	}
	
	//Copy Constructor
	public Product( Product PP) {
		   name = PP.name;
		   Price = PP.Price;
	}

	//Setters
	public void setPrice(double pp) {
		Price = pp;
	}
	public void setName(String nn) {
		name = nn;
	}
	
	//Getters
	public double getPrice() {
		return Price;
	}
	public String getName() {
		return name;
	}

	//Display
	public void displayAll() {
		
		System.out.println(" The Name is:" +name);
		System.out.println(" The Price is: " +Price);
	}
	
	
}
