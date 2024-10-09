/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 26, 2024
 */

package Week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */
public class Assignment7 {

    public static void main(String[] args) throws IOException  {
    	String fileName = promptName();
        char[][] grid = readFile(fileName);
        int maxSequence = findLongestSequence(grid);
        System.out.println("The longest sequence is " + maxSequence + " long.");
    }

    /**
     * findLongestSequence
     * returns the longest sequence of 'X' characters
     * either horizontal or vertical
     * @param grid, a 2D array of characters
     * @return an integer, the longest consecutive sequence of 'X' chars
     */

	public static int findLongestSequence(char[][] grid) {
		int currentSequence = 0;	// Keeps track of current sequence of Xs detected
		int maxSequence = 0;		// Keep track of max sequence of Xs detected
		
		
		// Increments through columns for each row to find the longest sequence
		// of subsequent Xs
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[row].length; col++) {
				// Checks current row and col of grid for 'X'
				if(grid[row][col] == 'X') {
					currentSequence += 1;
					// If current sequence of X's is greater than max sequence so far recorded
					if(currentSequence > maxSequence) {
						maxSequence = currentSequence;
					}
				}
				else	// Resets current sequence to 0 if X is not found
					currentSequence = 0;
			}
			// Set currentsequence to zero because new column is being checked
			currentSequence = 0;
		}
		// Increments through rows for each column to find longest sequence of
		// subsequent Xs
		for(int col = 0; col < grid[1].length; col++) {
			for(int row = 0; row < grid.length; row++) {
				// Checks current row and col of grid for 'X'
				if(grid[row][col] == 'X') {
					currentSequence += 1;
					// If current sequence of X's is greater than max sequence so far recorded
					if(currentSequence > maxSequence) {
						maxSequence = currentSequence;
					}
				}
				else	// Resets current sequence to 0 if X is not found
					currentSequence = 0;
			}
			// Set currentsequence to zero because new column is being checked
			currentSequence = 0;
		}
		// Returns the max sequence recorded
		System.out.println(maxSequence);
		return maxSequence;
		
	}

    /**
     * readFile
     * reads the file entered in the fileName parameter
     * the first row consists of the num of rows and num of cols
     * thereafter is a corresponding grid of characters
     * @param fileName
     * @return the 2D array of chars
     * @throws FileNotFoundException 
     * @throws IOException
     */

	public static char[][] readFile(String fileName) throws FileNotFoundException {
		// Opens file with name specified in param fileName
		File myGrid = new File(fileName);
		// Opens scanner to look through previous file
		Scanner grid = new Scanner(myGrid);
		
		int numRows = grid.nextInt();	// Obtains the number of rows from expected location in file
		int numCols = grid.nextInt();	// Obtains the number of columns from expected location in file
		int row = 0;
		
		String temp = "";	// Takes info of file line from scanner to be converted into char array

		// Initializes 2d char array with num of rows and cols obtained from scanner
		char charArray[][] = new char[numRows][numCols];
		
		// Loop goes until end of file is reached
		while(grid.hasNext()) {
			temp = grid.next();	// Set string temp to current line in file
			charArray[row] = temp.toCharArray();	// Convert string temp to char array
			row++; // increment row to check next line of grid
		}
		grid.close(); // closes grid scanner
		
		return charArray;	// returns 2d char array representing grid
	}

    /**
     * promptName 
     * prompts the user with the string "What is the filename?"
     * Uses a Scanner (keyboard) object to read in the line input from the user
     * @return the string input by the user
     */
	
	public static String promptName() {
		String fileName = "";	// Name of file
		Scanner in = new Scanner(System.in); // Scanner for user input
		System.out.print("Enter the name of the file: ");	// Prompt for user input
		fileName = in.next();	// Collection of user input
		in.close();	// close scanner
		
		return fileName;	// Returns user input as String representing file name
		
	}

	
}
