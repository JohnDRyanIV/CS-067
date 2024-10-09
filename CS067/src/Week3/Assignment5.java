/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 10, 2024
 */
package Week3;

import java.io.*;
import java.util.Scanner;


/**
 * 
 */
public class Assignment5 {
	
	public static void main(String[] args) {
		File myFile = new File("src/Data.txt");
		try {
			Scanner inputFile = new Scanner(myFile);
			
			String first = "";
			String second = "";
			String third = "";
			String current = "";
			String fileString = "";
			
			int length = 0;
			// For larger file sizes, modify program to use array of strings
			
			if(inputFile.hasNext()) {
				// Gathering string data from file
				while(inputFile.hasNext()) {
					fileString += inputFile.next();
				}
				
				System.out.println(fileString);		
				length = fileString.length();
				for(int i = 0; i < length; i++) {
					current = fileString.substring(i, i+1);
					if(current.equals("X") && (i+4 < length)) {
						first += fileString.substring(i+3, i+4);
					}
					else if (current.equals("Y") && (i+6 < length)) {
						second += fileString.substring(i+5, i+6);
					}
					else if (current.equals("W") && (i+5 < length)) {
						third += fileString.substring(i+4, i+5);
					}
				}
				
				System.out.println(first);
				System.out.println(second);
				System.out.println(third);
			}
			
			else {
				System.out.println("File is empty");
			}
			
			
			inputFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exist.");
			e.printStackTrace();
		}
		
	}
	
}
