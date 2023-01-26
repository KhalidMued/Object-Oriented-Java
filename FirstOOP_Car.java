package Practice_Course;

public class FirstOOP_Car {
	
	//Attributes
	private int door;
	private int window;
	
	// default constructor // Initial Values
	public FirstOOP_Car() {
	door =0;
	window =0;
	}
	
	// Constructor with parameters
	public FirstOOP_Car (int dd, int ww) 
	{
	door = dd;
	window = ww;
	}
	
	// Setters
	public void setDoor(int dd)
	{
	door = dd;
	}
	public void setWindow(int ww)
	{
	window = ww;
	}
	
	// Getters
	public int getDoor()
	{
	return door;
	}
	public int getWindow()
	{
	return window;
	}
	
	//Specific Methods
	public void display()
	{
	System.out.println("the nb of doors is: " + door);
	System.out.println("The nb of windows is: " + window);
	}
	public int summation()
	{
	return (door + window);
	}

}
