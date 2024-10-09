/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 3, 2024
 */

import java.util.Scanner;

/**
 * Purpose of this assignment is to get user input of name, weight, and height
 * and calculate and output user's BMI based on that information. Meta purpose
 * is to demonstrate that student can successfully obtain user input, perform
 * operations on that input, and format the output in a user-friendly way.
 */
public class Assignment3 {

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);  // Create a Scanner object
	    String name;
	    double weight;	// Pounds
	    double height;  // Inches
	    double BMI;		// Body Mass Index
	    
	    // Collecting user input
	    
	    System.out.println("Please enter your name: ");
	    name = in.nextLine();
	    System.out.println("Please enter your weight in pounds: ");
	    weight = in.nextDouble();
	    System.out.println("Please enter your height in inches: ");
	    height = in.nextDouble();
	    
	    // Calculating BMI
	    
	    BMI = 703 * (weight / (height * height));
	    
	    // Outputting BMI formatted to 2 decimal places
	    
	    System.out.print("BMI for " + name + " is " + String.format("%.2f", BMI));
	    
	    // Closing scanner
	    
	    in.close();
	    
	  }
	
}
