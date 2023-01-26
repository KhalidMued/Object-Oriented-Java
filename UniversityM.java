package Practice_Course;
import java.util.Scanner;
public class UniversityM {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		UniversityC AlYamamah = new UniversityC();
		
		AlYamamah.display();
		
		
		System.out.println("=========== Above Display of Default Constructor =================");
		System.out.println();
		
		AlYamamah.SetDepartment("Network & Security");
		AlYamamah.SetStaff(10);
		AlYamamah.SetTotalSalary(10000.50);
		
		AlYamamah.display();
		
		
		System.out.println("============= Above Display of Setters ===============");
		System.out.println();
		
		System.out.println(" The Department is: "+ AlYamamah.GetDepartment() );
		System.out.println(" The Number of Staff in the Department is: " + AlYamamah.GetStaff() );
		System.out.println(" The Number of the Total Salary is: " + AlYamamah.GetTotalSalary() );
		
		
		System.out.println("============= Above Display of Getters ===============");
		System.out.println();
		
		
		
		UniversityC AUS = new UniversityC( "Eng" ,10, 50000);
		
		AUS.display();
		
		System.out.println("============= Above Display of AUS ===============");
		System.out.println();


		System.out.println(" The Department For AUS is: "+ AUS.GetDepartment() );
		System.out.println(" The The Sum of Total Salary & Staff For AUS is: "+ AUS.Sum() );
		System.out.println(" The The Sum of Total Salary & Staff For AlYamamah is: "+ AlYamamah.Sum() );

		


	}

}
