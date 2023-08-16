//this is the interface class, it shares its content with thee sup classes that' why  
//we use implements on the sub classes
/* We Create an array in the main class, to all the students and kids in. We have a normal inheritance 
 class Student as a super and Post & Under grad as a sup. Hence, the Grading class " Interface " shares its 
 content with Student and Kids, then we write implements in Class Student and Kids */
package Lab10;
public interface Grading {

	public void computeGrade();
}
