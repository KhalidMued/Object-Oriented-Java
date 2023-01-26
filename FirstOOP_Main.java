package Practice_Course;

public class FirstOOP_Main {

	public static void main(String[] args) {

		FirstOOP_Car Toyota = new FirstOOP_Car ();
		
		Toyota.display();
		
		System.out.println("============================");
		
		Toyota.setDoor(4);
		
		Toyota.setWindow(5);
		
		Toyota.display();
		System.out.println("============================");
		
		System.out.println("The nb of doors for Toyota is : " + Toyota.getDoor());
		System.out.println("============================");
		
		FirstOOP_Car nissan = new FirstOOP_Car (2, 4);
		
		nissan.display();
		
		System.out.println("The nb of widows for Nissan is: " + nissan.getWindow());
		System.out.println("The sum for toyota is : " + Toyota.summation() );
		System.out.println("The sum for nissan is : " + nissan.summation());
		
		}

	}


