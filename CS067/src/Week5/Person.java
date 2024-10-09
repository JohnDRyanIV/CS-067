/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 26, 2024
 */
package Week5;

/**
 * 
 */
public class Person {
	
	private String name;
	private Date birthday;

	public Person(String string, Date dob) {
		name = string;
		birthday = dob;
	}

	public String toString() {
		return(this.name + "'s birthday is " + this.birthday.toString());
	}

}
