package Week12;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTester {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void validAnimalTest() {
		Animal a = new Animal();
		assertTrue(a.isValidType("Snake"));
		assertFalse(a.isValidType("Cat"));
		// https://www.baeldung.com/junit-assert-exception
	}
	
	@Test
	public void invalidAnimalTest() {
		
	}
	
	@Test
	public void changeInvalidToValidAnimalTest() {
		
	}
	
	@Test
	public void isValidWeightTest() {
		
	}
	
	@Test
	public void isInvalidWeightTest() {
		
	}

}
