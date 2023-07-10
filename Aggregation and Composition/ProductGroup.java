package Lab06;

public class ProductGroup {
//The Product Group is AlMara3i Company
	
	private String Name;
	private Product PDG[];
	private int nbp;
	
	//Default Constructor With 2 Parameters
	public ProductGroup(String nn, int Size) {
		
		Name = nn;
		PDG = new Product [Size];
		nbp = 0; //Number of products in the ProductGroup
	}
	
	//Add Product To The ProductGroup ( Composition )
	public boolean addProduct(Product PP) {
		
		if ( nbp < PDG.length) {
			PDG[nbp] = new Product (PP); //In Composition We need to create a new product Calling The Copy Const. 
			nbp++;
			return true;
		}
		
		else
			return false;
	}
	
	//Display The Products inside The ProductGroup 
	public void displayAll() {
		System.out.println(" The name of the Group is: "+Name);

		for (int i=0; i<nbp; i++) 
			PDG[i].displayAll();

	}

}
