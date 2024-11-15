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
