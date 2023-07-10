package Lab06;

public class Test_Product {

	public static void main(String[] args) {
		Product P1 = new Product ( " Milk " , 10);
		Product P2 = new Product ( " Bread " , 3.5);

		P1.displayAll();
		System.out.println();
		P2.displayAll();
		
		System.out.println();
		
		
		System.out.println(" ======= Below Copy Const.======= ");
		//To check Copy Constructor
		Product P3 = new Product (P1); //We Copied P1 Contents to P3
		P3.displayAll();
			
		
		


		
	}

}
