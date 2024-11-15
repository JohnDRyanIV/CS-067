package Week12;

import java.util.ArrayList;
import java.util.Arrays;

public class Animal {
	
	double weight;		// Weight of animal
	String name;		// Name of animal
	String type;		// Type or species of animal
	
	// ArrayList containing all valid types of animals that can be in this zoo
	ArrayList<String> validTypes = new ArrayList<String>(Arrays.asList("lion", "bear", "giraffe", "tiger", "snake", "monkey"));
	
	Animal() {
		weight = 160;
		name = "Massy";
		type = "giraffe";
	}
	
	Animal(double  w, String n, String t) throws ImproperAnimalTypeException, ImproperAnimalWeightException {
		// Checking that weight is valid integer
		if(!isValidWeight(w)) {
			throw new ImproperAnimalWeightException(w);
		}
		// Checking that type is valid string
		else if (!isValidType(t)) {
			throw new ImproperAnimalTypeException(t);
		}
		weight = w;
		name = n;
		type = t;
	}
	
	/**
	 * Returns true if type of animal is not contained within the validTypes array list
	 * @param t - String representing type of animal
	 * @return - Validity of animal that is being input
	 */
	public boolean isValidType(String t) {
		// is type of animal not contained in validTypes arraylist?
		if(!validTypes.contains(t.toLowerCase())) {
			return false;
		}
		return true;
	}
	
	public boolean isValidWeight(double w) {
		if(w > 0 && w < 1000000 ) {
			return true;
		}
		return false;
	}
	
	/**
	 * Method to change the weight of an animal
	 * @param w - Weight that animal is being changed to
	 * @throws ImproperAnimalWeightException
	 */
	public void changeWeight(double w) throws ImproperAnimalWeightException {
		if(isValidWeight(w)) {
			weight = w;
		}
		else {
			throw new ImproperAnimalWeightException(w);
		}
	}
	
	

}
