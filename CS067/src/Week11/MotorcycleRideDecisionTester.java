/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 7, 2024
 */
package Week11;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 */
public class MotorcycleRideDecisionTester {
	MotorcycleRideDecision mrd = new MotorcycleRideDecision();

		
		@Test
		public void testTempHigh() {
			boolean highTemp = mrd.willRideMotorcycle(90, 60, 0, 0, false);
			boolean goodTemp = mrd.willRideMotorcycle(80, 60, 0, 0, false);

			assertFalse(highTemp);
			assertTrue(goodTemp);
			
		}
		@Test
		public void testTempLow() {
			boolean lowTemp = mrd.willRideMotorcycle(88, 54.9, 0, 0, false);
			boolean goodTemp = mrd.willRideMotorcycle(88, 55, 0, 0, false);

			assertFalse(lowTemp);
			assertTrue(goodTemp);
		}
		@Test
		public void testWindHigh() {
			boolean tooWindy = mrd.willRideMotorcycle(88, 60, 0, 10, false);
			boolean goodWind =  mrd.willRideMotorcycle(88, 60, 0, 9.9, false);
			assertFalse(tooWindy);
			assertTrue(goodWind);
		}
		@Test
		public void testRainChance() {
			boolean tooRainy = mrd.willRideMotorcycle(88, 60, 15, 0, false);
			boolean goodRain = mrd.willRideMotorcycle(88, 60, 14.9, 0, false);
			assertFalse(tooRainy);
			assertTrue(goodRain);
		}
		@Test
		public void testIsBroken() {
			boolean bikeBroken = mrd.willRideMotorcycle(88, 60, 0, 0, true);
			boolean bikeGood = mrd.willRideMotorcycle(88, 60, 0, 0, true);
			assertFalse(bikeBroken);
			assertTrue(bikeGood);
		}
		@Test
		public void testIsValid() {
			boolean validToRide = mrd.willRideMotorcycle(88, 60, 2, 2, false);
			assertTrue(validToRide);
		}
}

