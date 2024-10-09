/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 26, 2024
 */
package Week5;

public class PersonDriver {
	
	public static void main(String[] args) {
		Date dob = new Date(30, 4, 1997);
		Person me = new Person("John Ryan", dob);
		System.out.println(me.toString());
	}
	
}
