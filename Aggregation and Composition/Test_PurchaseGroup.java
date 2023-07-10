package Lab06;

public class Test_PurchaseGroup {

	public static void main(String[] args) {

		//Aggregation
		PurchaseGroup pur1 = new PurchaseGroup ( "YU" , 100);
		
		
		Product P1 = new Product ( " Milk " , 10);
		Product P2 = new Product ( " Bread " , 3.5);
		Product P3 = new Product ( " Juice " , 15);
		Product P4 = new Product ( " Butter " , 6);
		
		
		pur1.AddProduct(P1);
		pur1.AddProduct(P2);
		pur1.AddProduct(P3);
		pur1.AddProduct(P4);
		
		pur1.displayAll();
	}

}
