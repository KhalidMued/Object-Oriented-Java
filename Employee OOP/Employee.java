package Practice_Course;


public class Employee {

	private String Name;
	private int NumOfHours;
	private double Rate;
	
	public Employee() {
		
		Name = "";
		NumOfHours = 0;
		Rate = 0;
	}
	
public Employee( String N, int H, int R) {
		
		Name = N;
		NumOfHours = H;
		Rate = R;
	}

public String getName() {
	return Name;
}

public void setName(String N) {
	Name = N;
}

public int getNumOfHours() {
	return NumOfHours;
}

public void setNumOfHours(int H) {
	NumOfHours = H;
}

public double getRate() {
	return Rate;
}

public void setRate(double R) {
	Rate = R;
}

public void display() {
	
	System.out.println("The Names is: " +Name);
	System.out.println("The Num of Hours is: " + NumOfHours);
	System.out.println("The Rate is: " +Rate);
	System.out.println("The Salary is: " + Salary());
	
	

}

public double Salary() {
	double Salary;
	return ( NumOfHours * Rate);
}




}

	
	
	


