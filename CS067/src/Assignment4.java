/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 5, 2024
 */


import java.io.*;
import java.util.Scanner;

/**
 * 
 */
public class Assignment4 {
	
	public static void main(String[] args) {
		
		File myFile = new File("Numbers.txt");
		try {
			Scanner inputFile = new Scanner(myFile);
			double min = Double.MAX_VALUE;
			double max = Double.MIN_VALUE;
			double average = 0;
			int lines = 0;
			double temp = 0;
			
			if(inputFile.hasNext()) {
			
				while(inputFile.hasNext()) {
					temp = inputFile.nextDouble();
					if(temp < min) {
						min = temp;
					}
					if (temp > max) {
						max = temp;
					}
					average += temp;
					lines++;
				}
				
				average = average / lines;
				
				System.out.println("There are a total of " + lines + " numbers.");
				System.out.println("The minimum number is: " + min);
				System.out.println("The maximum number is: " + max);
				System.out.println("The average is: " + String.format("%.2f", average));

				
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
