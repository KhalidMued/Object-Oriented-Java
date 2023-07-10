package Lab06;

public class PurchaseGroup {
	
	//The Product Group is AlMara3i Company
	
		private String Name;
		private Product PRP[];
		private int nbp;
		
		//Default Constructor With 2 Parameters
		public PurchaseGroup(String nn, int Size) {
			
			Name = nn;
			PRP = new Product [Size];
			nbp = 0;
		}
		
		//Add Product To The ProductGroup ( Aggregation )
		public boolean AddProduct(Product PP) {
			
			if ( nbp < PRP.length) {
				PRP[nbp] = PP; //In Aggregation We just the parameter as normal 
				nbp++;
				return true;
			}
			
			else
				return false;
		}
		
		//Display The Products inside The PurshaceGroup 
		public void displayAll() {
			System.out.println(" The name of the Group is: " +Name);
			System.out.println(" The Product to be orders are: ");

			for (int i=0; i<nbp; i++) 
				PRP[i].displayAll();

		}

}
