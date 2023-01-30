package Practice_Course;

public class BankM {

	public static void main(String[] args) {

		
Bank Saib = new Bank();
		
		Saib.display();
		
		
		System.out.println("=========== Above Display of Default Constructor =================");
		System.out.println();
		
		Saib.SetName("Khalid");
		Saib.Setaccountnum("AB23456789");
		Saib.Setbalance(10000.50);
		
		/* Saib.deposit(1000); For the Void Approach
		Saib.Withdraw(100); For the Void Approach */
		
		Saib.display();
		

		
		System.out.println("============= Above Display of Setters ===============");
		System.out.println();
		
		System.out.println(" The Name is: "+ Saib.GetName() );
		System.out.println(" The Number of acc num is: " + Saib.Getaccountnum() );
		System.out.println(" The acc balance is: " + Saib.Getbalance() );
		
		
		System.out.println("============= Above Display of Getters ===============");
		System.out.println();
		
		System.out.println("The amount after Withdraw is: " + Saib.Withdraw());
		System.out.println("The amount after Deposit is: " +Saib.deposit());
		

		System.out.println("============= Above Display of Withdraw & Deposit Method ===============");
		System.out.println();
		
		Bank SNB = new Bank( "Hassan", "SNB12045" , 20000);
		SNB.display();
		
		System.out.println("============= Above Display of Cons. With Parameters ===============");
		System.out.println();
		
		
		// IF Deposit and Withdraw were ' void ' we type EX. SNB.deposit(100) where 100 is the amount we will deposit in SNB
		
		/* double res = SNB.balance - 1500; It will work when balance is public 
		 System.out.print("The amount after res is: " +res);
		 */

		
		
	}

}
