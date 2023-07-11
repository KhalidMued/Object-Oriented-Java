
package inheritance;

public class Employee {
	
	private String name;
	private int age;
	
	public Employee() {
		
		name = " ";
		age = 0;
	}
	
	public Employee(String nn, int aa) {
		
		name = nn;
		age = aa;
	}

	public void setAge(int aa) {
		age = aa;
	}
	
	public void setName(String nn) {
		name = nn;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void display() {
		System.out.println(" The Name is:" +name);
		System.out.println(" The Age is: " +age);
	}
	
	public String toString() {
		
		return ( " [ Name = " +name+ " & Age = " +age+ " ]" );
	}

}

