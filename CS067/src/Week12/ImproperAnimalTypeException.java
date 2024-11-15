/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 14, 2024
 */
package Week12;

public class ImproperAnimalTypeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -669715981608166768L;

	public ImproperAnimalTypeException(String n) {
		super("A " + n + " does not belong in the zoo!");
	}
}
