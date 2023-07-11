
package inheritance;


public class Test_Employee {

	public static void main(String[] args) {

		PartTime PT2 = new PartTime ();
		PT2.setName("Ahmed");
		PT2.setAge(30);
		PT2.setNbh(10);
		PT2.setRate(200);
		
		PT2.display();
		System.out.println(" The Salary is:$" + PT2.Salary() );
		
		System.out.println(" =========================== ");
		
		PartTime PT1 = new PartTime ("Khalid", 25 , 56, 33.5);
		System.out.println(" The Salary is:$" + PT1.Salary());
		System.out.println( PT1.toString() );
		
		System.out.println(" The Get Name for PT1 :" + PT1.getName());
		
		System.out.println(" =========================== ");
		
		FullTime PT3 = new FullTime ("Khalid", 25 , 1800);
		PT3.display();


	}

}

/*Set Name belongs to the Employee because its written in the Employee Class
but we can use it for the part time employee because we inherited it from Employee class
Also, we created a part time employee not employee because it has all the methods we need to use
 + specific method*/
