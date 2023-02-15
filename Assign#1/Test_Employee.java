package Assig1;

public class Test_Employee {

	public static void main(String[] args) {

	Employee Emp1 = new Employee( 1122 , "Khalid" , "Mohamed" , 3000);
		
		System.out.println("The Get Fist Name: "+Emp1.getFirstName());
		System.out.println("The Get Last Name: "+Emp1.getLastName());
		System.out.println("The Get Name: "+Emp1.getName());
		System.out.println("The Get ID: "+Emp1.getID());
		System.out.println("The Get Salary: "+Emp1.getSalary());
		
		System.out.println("\n" + "=========== Above is the Getters =========" + "\n" );
		
		Emp1.display();
		System.out.println(Emp1.toString());
		
		System.out.println("\n" + "=========== Above is the display & ToString Method =========" + "\n" );
				
		Emp1.setSalary(55000);
		System.out.println("The Annunal Salary is: $" + Emp1.getAnnualSalary());
		
		System.out.println("The Raised Salary by 10% is: $" + Emp1.RaiseSalary(30));
	
		System.out.println("\n" + "=========== Above Set Salary Method + Get Annual Salary + Raise Salary =========" + "\n" );

	}

}
