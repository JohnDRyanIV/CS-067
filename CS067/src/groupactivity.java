/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 5, 2024
 */

import java.util.Scanner;

/**
 * 
 */
public class groupactivity {
	
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
        int hours = 0;
        String message = "";
        System.out.println("Enter how many hours of sleep you got: ");
        
	    hours = keyboard.nextInt();
	    
	    if(hours > 8) {
	    	message = "You are well-rested!";
	    }
	    else if (hours > 4) {
	    	message = "The coffee shop is around the corner.";
	    }
	    else if(hours >= 0) {
	    	message = "Are you sure you're awake?";
	    }
	    else {
	    	message = "Input error.";
	    }
	    
	    System.out.println(message);
	    
	    keyboard.close();
	}

    
    
}
