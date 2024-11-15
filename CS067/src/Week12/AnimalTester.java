/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 14, 2024
 */

package Week12;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTester {
	Animal a = new Animal();
	
	@Test
	public void validAnimalTest() {
		String validTypes[] = {"lion", "bear", "giraffe", "tiger", "snake", "monkey"};
		String invalidTypes[] = {"cougar", "whale", "anenome", "florida man"};
		for(String s : validTypes) {
			assertTrue(a.isValidType(s));
		}
		for(String s : invalidTypes) {
			assertFalse(a.isValidType(s));
		}
	}
	
	@Test(expected = ImproperAnimalTypeException.class)
	public void improperAnimalTypeExceptionTest() {
		Animal b = new Animal(160, "Lorko", "koala");
	}
	
	@Test
	public void validWeightTest() {
		double validWeights[] = {0.1, 600, 1000, 5000, 20};
		double invalidWeights[] = {0, 10000000, -500};
		for(double d : validWeights) {
			assertTrue(a.isValidWeight(d));
		}
		for(double d : invalidWeights) {
			assertFalse(a.isValidWeight(d));
		}
	}
	
	@Test(expected = ImproperAnimalWeightException.class)
	public void improperAnimalWeightExceptionTest() {
		Animal b = new Animal(-50, "jim", "giraffe");
	}

}
