package Week3;
/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 17, 2024
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */
public class Assignment6 {
		
	public static void main(String[] args) {
		File myGrid = new File("src/Week3/Grid.txt");
		File myDict = new File("src/Week3/dictionary.txt");
		
		char[][] gridString = new char[6][6];	// Data from Grid is put into here
		ArrayList<String> dictionary = new ArrayList<String>(); // String values from dictionary are here
		ArrayList<String> foundWords = new ArrayList<String>(); // ArrayList holding found words
		String temp;			// Holds temporary string values
		String tempHoriz = "";	// Holds string representation of horizontal gridString char array
		String tempVert = "";	// Holds string representation of vertical gridString char array
		int row = 0;			// Used to track which row of gridString data is being taken from
		int offset = 1;			// Used to keep track of character offset when looking for valid strings in gridString
		try {
			Scanner in = new Scanner(myGrid);
			Scanner dict = new Scanner(myDict);
					
			// Populate gridString array
			while(in.hasNext()) {
				temp = in.next();
				gridString[row] = temp.toCharArray();
				row++;
			}
			// Populate dictionary array
			row = 0;
			while(dict.hasNext()) {
				dictionary.add(dict.next());
			}
						
			for(int r = 0; r < gridString.length; r++) {
				// Make strings that contain the chars listed for easier processing
				for(int c = 0; c < gridString[r].length; c++) {
					tempHoriz += String.valueOf(gridString[r][c]);
					tempVert += String.valueOf(gridString[c][r]);
				}
				// Search horizontal and vertical gridString row and column for valid dictionary words to output
				while(offset < 6) {
					for(int i = 0; i < gridString.length - (offset - 1); i++) {
						// Loop through all variations of strings that can be contained in the given row
						temp = tempHoriz.substring(i, i+offset);
						if(dictionary.contains(temp))
							foundWords.add(temp);
						temp = tempVert.substring(i, i+offset);
						if(dictionary.contains(temp))
							foundWords.add(temp);
					}
					offset++;
				}
				
				offset = 1;
				tempHoriz = "";
				tempVert = "";
			}
			
			// Organizing output alphabetically
			Collections.sort(foundWords);
			for(int i = 0; i < foundWords.size(); i++) {
				System.out.println(foundWords.get(i));
			}
			
			in.close();
			dict.close();
		}
		catch (FileNotFoundException e){
			System.out.println("error");
			e.printStackTrace();
		}

	}
	
}
