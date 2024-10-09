/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 3, 2024
 */

/**
 * 
 */
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
    	// Initializing Scanner object
        Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
        // Declaring variables that will be used
        int people;
        double bill;
        double perPerson;
        // Collecting user input
        System.out.println("Enter the number of people: ");
        people = keyboard.nextInt();
        System.out.println("Enter the cost of the bill: ");
        bill = keyboard.nextDouble();
        // Calculating bill with tip & per person payment
        bill *= 1.15;
        perPerson = bill / people;
        // Outputting information formatted to 2 decimal places
        System.out.printf("With a 15 percent tip, the total bill is %.2f\n", bill);
        System.out.println("Each person owes $" + String.format("%.2f", perPerson));
        // Closing Scanner object
        keyboard.close();
    }
}