package Assig1;

public class Employee {

	private int id;
	private String FirstName;
	private String LastName;
	private int Salary;
	
	public Employee() {
		
		id = 0;
		FirstName = " ";
		LastName = " ";
		Salary = 0;
	}
	
	public Employee (int idd, String FN, String LN, int Sal) {
		
		id = idd;
		FirstName = FN;
		LastName = LN;
		Salary = Sal;
		
	}
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public String getName() {
		return FirstName + " " + LastName;
	}
	
	public int getSalary() {
		return Salary;
	}
	
	public void setSalary(int Sal) {
		
		Salary = Sal;
	}
	
	public int getAnnualSalary() {

		return Salary * 12;
	}
	
	public int RaiseSalary(int percent) {
		return this.Salary= Salary + (Salary*percent/100);
	}
	public void display() {
		
		System.out.println("The id number is: " +id);
		System.out.println("The First Name is: " +FirstName);
		System.out.println("The Last Name is: " +LastName);
		System.out.println("The Salary is: " +Salary);
	}
	
	public String toString() {
		
		return ("Employee[id = " + id +" , name = " + FirstName + " " + LastName + " , Salary = " + Salary + " ]");
	}
	
	
}
