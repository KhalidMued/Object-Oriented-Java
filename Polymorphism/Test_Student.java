//In this PolyMorphism the array is of type Student(super class), but the contents of the array are of type Undergrad & PostGrad (mixed)(sub class) 

package Lab08;

public class Test_Student {
public static void main(String[] args) {

	Student Arr[] = new Student[10];
	Arr[0]= new undergradSt ("Bader" , "1122" , 85, true);
	Arr[1]= new undergradSt ("Ahmed" , "1982" , 55, false);
	Arr[2]= new PostGrad ("Yasser" , "4652" , 90, false);
	Arr[3]= new PostGrad ("Khalid" , "1783" , 99, true);
	
	
	//The method below " Compute Grade " is called Polymorphically.
	for(int i=0; i<4; i++) {
		
		Arr[i].display();
		System.out.print("The sudent " +Arr[i].getName() + " has: ");
		Arr[i].computeGrade();//Note that the Array of type student so by writing " Arr[i].computeGrade(); " We need to have this method in the super class.
		System.out.println(" ================ ");
		
	}
	
	//Count the number of objects of type PostGrad in the Array
	int CountP = 0;
	int CountU = 0;
	for(int i=0; i<4; i++) {
	if ( Arr[i] instanceof PostGrad)
		CountP ++;
	else CountU++;
	}
	System.out.println(" There are " + CountP +" of Post Grad");
	System.out.println(" There are " + CountU +" of Under Grad");



	
	
	}
}
