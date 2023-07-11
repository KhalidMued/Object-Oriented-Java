
package inheritance;

public class PartTime extends Employee{
	//extends: it inherits all the methods and attribute from Employee Class
	//Super: Calls the needed method from the main class which is the Employee Class
	private int nbh;
	private double rate;
	
	public PartTime() {
		
		nbh = 0;
		rate = 0.0;
	}
	
	public PartTime(String nn, int aa, int hh, double rr) {
			//We used super wiht parameters to call the const. with para from Employee Class
			super(nn,aa);
			nbh = hh;
			rate = rr;
		}

	public int getNbh() {
		return nbh;
	}

	public void setNbh(int nbh) {
		this.nbh = nbh;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void display() {
		//we used super.display to call the display method from Employee Class
		super.display(); 
		System.out.println(" The nb of Hours is:" +nbh);
		System.out.println(" The Rate is: " +rate);
	}
	
	public String toString() {
		//we used super.toString to call the toSting method from Employee Class
		return ( super.toString() + " [ nbh = " +nbh+ " & Rate = " +rate+ " ]" );
	}
	
	//This is a specific Method for the Part Time Employee
	public double Salary() {
		
		return rate * nbh;
	}

}

