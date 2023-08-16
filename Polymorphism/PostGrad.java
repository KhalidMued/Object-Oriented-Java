package Lab08;

public class PostGrad extends Student{
	
private boolean Teaching;

	public PostGrad(){
	super();
	Teaching = false;
	}
	
	public PostGrad(String nn, String ii, int tt, boolean tc){
	super(nn,ii,tt);
	Teaching = tc;
	}
	
	public boolean isTeaching() {
	return Teaching;
	}
	
	public void setCoop(boolean Teaching) {
	this.Teaching = Teaching;
	}
	
	public void display(){
	super.display();
	System.out.println("The Teaching is: " + Teaching);
	}
	
	public String toString(){
	return(super.toString() + "\n the Coop is : " + Teaching);
	}
	
	public void computeGrade(){
		
	if(getTotalMarks() >= 70)
	System.out.println("Pass");
	else
	System.out.println("Fail");
	}
	
}

