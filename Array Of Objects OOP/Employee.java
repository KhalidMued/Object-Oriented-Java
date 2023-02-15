package EmpToComp;


public class Employee {
	
	private String name;
	private int age;
	private char gender;
	
	//Default Constructor
	public Employee() {
		
		name = " ";
		age = 0;
		gender = ' ';
	}
	
	//Default Constructor with Parameter
	public Employee(String N, int ag, char gen) {
		
		name = N;
		age = ag;
		gender = gen;
	}
	
	//Getters
	public String getName() {
	return name;
}
	public int getAge() {
	return age;
}
	public char getGender() {
	return gender;
}

	//Setters
	public void setName(String N) {
	name = N;
}
	public void setAge(int ag) {
	age = ag;
}
	public void setGender(char gen) {
	gender = gen;
}

	//ToString Method
	public String toString() {
	
	return ( "Employee name is: " + name + " The Age is:" + age + " The gender is: " + gender );
}
	
	//Display Method
	public void display() {
	
	System.out.println("The name is: "+name);
	System.out.println("The age is: " +age);
	System.out.println("The Gender is: "+gender);
}


	
	
	

}

