package Practice_Course;
import java.util.Scanner;
public class Bank {

	private String name;
	private String accountnum;
	/*public*/ private double balance;
	
	public Bank() {
		
		name = "";
		accountnum = "";
		balance = 0;
	}
	
public Bank( String N, String A, double B) {
		
		name = N;
		accountnum = A;
		balance = B;
	}

//Setters
	public void SetName (String N) {
		
		name = N;
		
	}
	public void Setaccountnum (String A) {
		
		accountnum = A;
		
	}
	public void Setbalance(double B) {
		
		balance = B;
		
	}
	
	//Getters
	
	public String GetName() {
		
		return name;
		
	}
	public String Getaccountnum () {
		
		return accountnum;
		
	}
	public double Getbalance() {
		
		return balance;
		
	}
	
	//Specific Methods
		public void display() {
			
			System.out.println(" The Name is: "+ name) ;
			System.out.println(" The Acc Num is: "+ accountnum);
			System.out.println(" The Balance is: "+ balance);
		}
		
public double deposit() {	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter the Amout to Deposit: ");
	double w = input.nextDouble();

			return (double )( w + balance );
		}

/* Another Way to do deposit
public void deposit (double Amount)
{
balance += Amount;
} */
		
public double Withdraw() {
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter the Amout to Withdraw: ");
	double d = input.nextDouble();
		return (double) ( d - balance );
	}
}

/* Another Way to do Withdraw
public void deposit (double Amount)
{
balance -= Amount;
} */
	
		
	
	
	

