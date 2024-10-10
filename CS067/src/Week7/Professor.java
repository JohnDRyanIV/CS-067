/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 10, 2024
 */
package Week7;

/**
 * 
 */
public class Professor extends Person{
	private String specialization;
	
	public Professor(String n, String s, int y, int m, int d)
	{
		super(n,y,m,d);
		specialization = s;
	}
	
	public String getSpecialization()
	{
		return specialization;
	}
	
	public void setSpecialization(String s)
	{
		specialization = s;
	}
	
	public String toString()
	{
		String returnString = "";
		returnString += "Professor: " + "\n";
		returnString += " name: " + name +  "\n";
		returnString += " age: " + getAge() + "\n";
		returnString += " specialization: " + specialization + "\n";
		return returnString;
	}
}
