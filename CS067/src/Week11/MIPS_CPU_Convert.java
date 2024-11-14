/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 5, 2024
 */
package Week11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * 
 */
public class MIPS_CPU_Convert {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/Week11/output.txt");
			File input = new File("input.txt");
			Scanner in = new Scanner(input);
			String temp = "";
			String output = "";
			
			while(in.hasNext()) {
				temp = in.nextLine();
				output += temp.substring(6, 8) + " ";
				output += temp.substring(4, 6) + " ";
				output += temp.substring(2, 4) + " ";
				output += temp.substring(0, 2);
				System.out.println(output);
				fw.write(output + "\n");
				output = "";
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error");
		}
	}


	
}
