//PolyMorphism
//Make an array in the test class to store the undergrad and PostGrad in the array
//to use the methods that are in the post & undergrad classes make an empty method in the Father class(Student)
//With the same type & name of the method you want to use

	package Lab08;
	
	public abstract class Student { //Use abstract modifire 
		
	private String name;
	private String Id;
	private int totalMarks;
	
	public Student()
	{
	name = " ";
	Id = " ";
	totalMarks= 0;
	}
	
	public Student(String nn, String ii, int tt)
	{
	name = nn;
	Id = ii;
	totalMarks= tt;
	}
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public String getId() {
	return Id;
	}
	
	public void setId(String id) {
	Id = id;
	}
	
	public int getTotalMarks() {
	return totalMarks;
	}
	
	public void setTotalMarks(int totalMarks) {
	this.totalMarks = totalMarks;
	}
	
	/*When Calling Arr[i].compute grade it will be directed here cuz the array  is of type student. Then it will navigate it to UnderGrad || PostGrad
	public void computeGrade() {
		System.out.println(" ");
	}*/
	
	
	//To use Abstract instead of writing the whole method above, use instead absrtact
	public abstract void computeGrade();
	
	public void display(){
	System.out.println("The name is : " + name);
	System.out.println("The Id is : " + Id);
	System.out.println("The total Marks is : " + totalMarks);
	}
	
	public String toString(){
	return ("The name is : " + name + "\nThe Id is : " + Id +
	"\nThe total Marks is : " + totalMarks);
	}
	
		}

