/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Aug 29, 2024
 */

/**
 * 
 */
public class Group_Activity {
	public static void main(String[] args) {
		/*
		// Print integers between 1 and 5
		for(int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		// Multiples of 3 between 33 and 66
		for(int i = 33; i < 69; i+=3) {
			System.out.println(i);
		}
		// Infinite loop
		for(int i = 1; i < 0; i++) {
		}
		// sum even numbers between 1 and 99
		int sum = 0;
		for(int i = 2; i < 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		// Count down from 100 to 0
		for(int i = 100; i > -1; i--) {
			System.out.println(i);
		}
	*/
		String greeting = "hello there";
		String postLoop = "";
		for (int i = greeting.length() - 1; i >= 0; i--) {
			//System.out.println(greeting.charAt(i));
			postLoop += greeting.charAt(i);
		}
		System.out.println(postLoop);
	}
}
