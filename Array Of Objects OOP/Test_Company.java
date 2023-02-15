package EmpToComp;

public class Test_Company {
	public static void main (String args[]) {
		
	Company C1 = new Company (10);
	Employee Emp1 = new Employee("Khalid", 21 , 'M');
	Employee Emp2 = new Employee("Ahmed", 22 , 'M');
	
	C1.inssertEmployee(Emp1);
	C1.inssertEmployee(Emp2);
	C1.displayAll();
	System.out.println(" ============== ");
	System.out.println("The Average of Emp Ages is: " +C1.AverageOfAge());
	System.out.println("The Employee: " +C1.findEmployeeByName("Khalid"));
	System.out.println("Find the Employee: " + C1.findEmployee(Emp2));
	
	System.out.println(" ====================== ");
	
	Company C2 = new Company ("Al-Marai" , 50); // Constructor with Two Parameter. ( Name = Al-Marai , Size of Array = 50 , nbe = 0).
	Employee Emp3 = new Employee ("Ali", 32, 'M');
	Employee Emp4 = new Employee ("Ahmed", 31, 'M');
	Employee Emp5= new Employee ("Kahlid", 35, 'M');
	C2.inssertEmployee(Emp3);
	C2.inssertEmployee(Emp4);
	C2.inssertEmployee(Emp5);
	C2.displayAll();
	
	System.out.println("===============");
	
	C2.deleteEmployee(1);
	C2.displayAll();
	
	
	}

}

