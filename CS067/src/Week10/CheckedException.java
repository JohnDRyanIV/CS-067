/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 31, 2024
 */
package Week10;


/**
 * Example to illustrate a Checked Exception in java
 * Java will will not allow an un-caught IOException to run (syntax error)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "neato.txt";
		displayFile(fileName);
	}
	
	public static void displayFile(String name) throws FileNotFoundException
	{
		File file = new File(name);
		Scanner inputFile = new Scanner(file);
		while(inputFile.hasNext())
		{
			System.out.println(inputFile.nextLine());
		}
			
		inputFile.close();
	}

}

