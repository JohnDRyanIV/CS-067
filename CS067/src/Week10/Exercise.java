/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 31, 2024
 */
package Week10;

/**
 * update the code to catch the InputMismatchException if the user
 * enters something that is not an int
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise {
  public static void main (String[] args) {
		int value = -1;
        Scanner keyboard = new Scanner(System.in);
        while (value != 5) {
            System.out.println("Please enter the integer 5: ");
            try {
                value = keyboard.nextInt();
            }
            catch (InputMismatchException e) {
            	System.out.println("You entered an invalid value");
            } 
            keyboard.nextLine(); // clear the input buffer
        }
        System.out.println("you did it!");
        keyboard.close();
	}  
}

