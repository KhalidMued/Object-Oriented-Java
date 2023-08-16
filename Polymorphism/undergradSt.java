package Lab08;

public class undergradSt extends Student{
	
	private boolean coop;
	
	public undergradSt(){
	super();
	coop = false;
	}
	
	public undergradSt(String nn, String ii, int tt, boolean cc){
	super(nn,ii,tt);
	coop = cc;
	}
	
	public boolean isCoop() {
	return coop;
	}
	
	public void setCoop(boolean coop) {
	this.coop = coop;
	}
	
	public void display()	{
	super.display();
	System.out.println("The coop is: " + coop);
	}
	
	public String toString()	{
	return(super.toString() + "\n the Coop is : " + coop);
	}
	
	public void computeGrade(){
		
	if(getTotalMarks() >= 60)
	System.out.println("Pass");
	else
	System.out.println("Fail");
	}
	
}

