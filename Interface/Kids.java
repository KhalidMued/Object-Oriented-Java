package Lab10;

public class Kids implements Grading{

	private String name;
	private int nba; //Number of Answers

	public Kids(){
	name = " ";
	nba= 0;
	}

	public Kids(String nn, int bb){
	name = nn;
	nba = bb;
	}


	public void computeGrade() {
	
		if (nba >= 100) 
		System.out.println("You win");
		
			else
		System.out.println("You lost");
		

	}
	

}
