package EmpToComp;


public class Company {
	private String name; //Name of the Company
	private Employee ArrEmp[];
	private int nbe; //Count the number of elements inside the Array
	
	//Default Constructor
	public Company() {
		
		name = " ";
		ArrEmp = new Employee[100]; //100 as a maximum value
		nbe = 0;
	}
	
	//Default Constructor with One parameter
	public Company(int size) {

		name = " ";
		ArrEmp = new Employee[size];
		nbe = 0;
	
	}
	
	//Default Constructor with Two parameter
	public Company(String nn, int size) {
			name = nn;
			ArrEmp = new Employee[size];
			nbe = 0;
		
		}
	
	//insertEmployee Method
	public boolean inssertEmployee (Employee EE) {
		
		if ( nbe < ArrEmp.length) {
		
		ArrEmp[nbe] = EE;
		nbe ++;
		return true;
		}
		else return false;
		
	}
	
	//Average of Age Method
	public double AverageOfAge() {
		int sum = 0;
		for ( int i=0; i<nbe; i++) {
			 sum += ArrEmp[i].getAge();
		}
		
		if (nbe!=0)
			return (double) sum/nbe;

		else
			return 0.0;
		
	}
	
	//Oldest Employee Method
	public Employee oldestEmployee() {
		
		Employee oldest = ArrEmp[0];
		for (int i = 1; i<nbe; i++) { 
			
			if (ArrEmp[i].getAge() > oldest.getAge() ) 
				oldest = ArrEmp[i];
	
		}
		return oldest;
	
		
	}
	
	//Find Employee by name Method
	public boolean findEmployeeByName(String name) {
		
			for(int i=0; i<nbe; i++)
				if(ArrEmp[i].getName() == name)
						return true;
			return false;
			
			}
	
	//Find Employee by Object (EX. Emp1 ) 
	public int findEmployee (Employee EE) {
		
		for (int i=0; i<nbe; i++) {
			if (EE == ArrEmp[i]) {
		return i;
			}
		}
				
			return -1;
		
		
	}
	
	//Delete Employee Method
	public boolean deleteEmployee(int pos) {

		
		/*
		 Change Parameter to (Employee EE)
		 if (nbe == 0)
			return false;
		
		else
	
			{
				ArrEmp[nbe] = ArrEmp[nbe-1];
				ArrEmp[nbe -1] = ArrEmp[nbe];
				nbe --;
				return true;
			}*/
		
		if ( nbe == 0)
			return false;
		
		else {
			
		}
		ArrEmp[pos] = ArrEmp[nbe-1];
		ArrEmp[nbe -1] = null;
		nbe --;
		return true;
		
	}
	
	//Display Method
	public void displayAll() {
		
		for ( int i = 0; i<nbe; i++) {
			ArrEmp[i].display();
			
		}
	}
}

