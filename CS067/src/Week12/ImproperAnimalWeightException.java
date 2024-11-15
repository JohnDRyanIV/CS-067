/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 14, 2024
 */
package Week12;

public class ImproperAnimalWeightException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5932313296378931230L;
	public ImproperAnimalWeightException(double n) {
		super(String.valueOf(n) + " is an invalid age for an animal.");
	}
}
