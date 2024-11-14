/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 7, 2024
 */
package Week11;



public class ImproperMonthlySalaryException extends RuntimeException{
	public ImproperMonthlySalaryException()
	{
		super("You cannot give an employee a negative monthly salary.");
	}
}

