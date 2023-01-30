package Practice_Course;


public class EmployeeMain {

	public static void main(String[] args) {

		
		Employee Emp = new Employee();
		
		Emp.setName("Khalid");
		Emp.setNumOfHours(3);
		Emp.setRate(10.9);
		Emp.display();
		
		System.out.println(" ==================== ");
		
		System.out.println("The Name of The Employee is: " +Emp.getName());
		System.out.println("The Number of Hours for The Employee is: " +Emp.getNumOfHours());
		System.out.println("The Rate of The Employee is: " +Emp.getRate());

		
		System.out.println(" ==================== ");

		Employee Emp2 = new Employee("Yasser" , 9, 50);
		Emp2.display();



		
	}

}



