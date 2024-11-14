/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 31, 2024
 */
package Week10;


/**
 * Example of throwing a user-defined exception manually
 */

 import java.util.Scanner;

public class BadPassword 
{
	public static void main(String[] args) 
	{     
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter your username: ");   
		String username = keyboard.next();
		System.out.print("Enter your password: ");
		String pass = keyboard.next();

		keyboard.close();
		
		// in reality you would create a hash of the password and
		// check it against this user's hashed password which is
		// stored in the database
		if(pass.equals("spaceMan453")) 
		{
			System.out.println("You password is correct!");
		}
		else 
		{
			throw new IncorrectPasswordException(username);
        }
	}
}


