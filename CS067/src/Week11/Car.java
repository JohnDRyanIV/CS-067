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
public class Car implements Serializable {
	
	private String make;		// Make of car
	private String model;		// Model of car
	private int year;			// Year of car
	private Person driver;		// Person driving car
	
	public Car(String ma, String mo, int y, Person d) {
		make = ma;
		model = mo;
		year = y;
		driver = d;
	}

	@Override
	public String toString() {
		return "Make: " + make + " | Model: " + model + " | Year " + year + " || Driver: " + driver;
	}
	
	

}
