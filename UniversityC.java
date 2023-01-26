package Practice_Course;

public class UniversityC {
	
	private String Department;
	private int Staff;
	private double TotalSalary;

	//Default Constructor
	public UniversityC () {
		
		Staff = 0;
		TotalSalary = 0;
		Department = "None";
	
	}
	
	// Constructor with parameters for (AUS)
		public UniversityC (String D, int S, double T) 
		{
		Department = D;
		Staff = S;
		TotalSalary = T;
		}
		
	
	//Setters
	public void SetDepartment (String D) {
		
		Department = D;
		
	}
	public void SetStaff (int S) {
		
		Staff = S;
		
	}
	public void SetTotalSalary(double T) {
		
		TotalSalary = T;
		
	}
	
	//Getters
	
	public String GetDepartment () {
		
		return Department;
	}
	
	public int GetStaff() {
		return Staff;
	}
	
	public double GetTotalSalary() {
		return TotalSalary;
	}
	
	
	//Summation
	public double Sum() {
		return (Staff + TotalSalary);
	}
	
	//Specific Methods
	public void display() {
		
		System.out.println(" The Number of Staff is: "+ Staff);
		System.out.println(" The Number of Total Salaries is: "+ TotalSalary);
		System.out.println(" The Dep is: "+ Department);
	}
	

}
