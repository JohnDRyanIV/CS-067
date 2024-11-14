/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 5, 2024
 */
package Week11;

import java.io.Serializable;

/**
 * 
 */
public class Person implements Serializable{
	
	private String name;	// Name of person
	private int age;		// Age of person
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}

	@Override
	public String toString() {
		return "Name: " + name + " | Age: " + age;
	}
	
	

}
