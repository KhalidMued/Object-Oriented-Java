package Lab06;

public class Test_ProductGroup {
// We Create a Company " Al-Maraie" Then Add The Products into the Company
	
	public static void main(String[] args) {

		//Composition
		ProductGroup PG1 = new ProductGroup (" Al-Maraie", 100);
		
		Product P1 = new Product ( " Butter " , 6);
		Product P2 = new Product ( " Water " , 1.5);
		
		//Add Product Inside The Product Group, Then Print the contents inside the ProductGroup
		PG1.addProduct(P1);
		PG1.addProduct(P2);
		
		PG1.displayAll();

	}

}
