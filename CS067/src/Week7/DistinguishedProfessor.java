/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 10, 2024
 */
package Week7;

/**
 * 
 */
public class DistinguishedProfessor extends Professor{
	public DistinguishedProfessor(String n, String s, int y, int m, int d)
	{
		super(n, s, y, m, d);
	}
	
	public String brag()
	{
		return "I'm distinguished!";
	}
	
	public String toString()
	{
		String returnString = "";
		returnString += "Distinguished Professor: ";
		returnString += " name: " + name + "\n";
		returnString += " age: " + getAge()+ "\n";
		returnString += " specialization: " + getSpecialization()+ "\n";
		returnString += "Did I mention that " + brag() + "\n";
		return returnString;
	}
}
