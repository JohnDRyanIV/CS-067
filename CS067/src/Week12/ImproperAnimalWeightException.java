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
