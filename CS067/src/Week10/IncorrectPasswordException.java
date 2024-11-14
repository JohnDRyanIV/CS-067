/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 31, 2024
 */
package Week10;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Example of creating your own exceptions
 * IncorrectPassworException inherits from RuntimeException
 */

public class IncorrectPasswordException extends RuntimeException
{
	String username;
	public IncorrectPasswordException(String un) 
	{
		super("Incorrect Password");
		username = un;
		File file = new File("log.txt");
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write("Username: " + username + "\n");
			fw.write("Date Accessed: " + LocalDate.now().toString() + "\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

