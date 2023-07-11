
package inheritance;


public class FullTime extends Employee{
	//extends: it inherits all the methods and attribute from Employee Class
	//Super: Calls the needed method from the main class which is the Employee Class
	
	private double WeeklySalary;
	
	public FullTime() {
	
		WeeklySalary = 0.0;
	}
	
	public FullTime(String nn, int aa, double ww) {
			//We used super with parameters to call the const. with para from Employee Class
			super(nn,aa);
			WeeklySalary = ww;
			
		}

	public double getWeeklySalary() {
		return WeeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		WeeklySalary = weeklySalary;
	}

	public void display() {
		//we used super.display to call the toSting method from Employee Class
		super.display(); 
		System.out.println(" The WeeklySalary is:$"+ WeeklySalary);
	}
	
	public String toString() {
		//we used super.toString to call the toSting method from Employee Class
		return ( super.toString() + " [WeeklySalary " +WeeklySalary+" ]" );
	}
	
	//This is a specific Method for the Part Time Employee
	public double WeeklySalary() {
		
		return 4 * WeeklySalary;
	}

}

