/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 8, 2024
 */
package MidtermProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */
public class PromptController {

	/**
	 * Prompts the user to enter information that can be used to create a new Task object
	 * @return
	 */
	public Task promptTask(Scanner in) {
		String taskName = "";
		String taskDescription = "";
		String dueDateHolder = "";
		LocalDate taskDueDate = null;
		
		System.out.println("Enter title of task: ");
		taskName = in.next();
		System.out.println("Enter description of task: ");
		taskDescription = in.next();
		
		System.out.println("Enter date of task (yyyy-mmm-dd), or press enter for no date: ");
		dueDateHolder = in.next();
		
		while(taskDueDate == null) {
			try {
				// following code found here: https://stackoverflow.com/questions/8746084/string-to-localdate
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
				formatter = formatter.withLocale(Locale.US);  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
				taskDueDate = LocalDate.parse(dueDateHolder, formatter);
			}
			catch(Exception e) {
				System.out.println("Error in entered date. Try again (yyyy-mmm-dd), or press enter for no date: ");
				dueDateHolder = in.next();
			}
		}

		Person p = promptPerson(in);
		
		if(taskDueDate != null) {
			//TODO implement date finder
			Task t = new Task(taskName, taskDescription, taskDueDate, p);
		}
		Task t = new Task(taskName, taskDescription, p);	
		
		return t;
	}
	
	/**
	 * Prompts the user to enter information that can be used to make a new person object
	 * @return
	 */
	public Person promptPerson(Scanner in) {
		
		String personName = "";
		int personAge = -1;
		String personRelation = "";
		
		System.out.println("Enter name of person: ");
		personName = in.next();
		while(personAge < 0) {
			System.out.println("Enter age of person: ");
			personAge = in.nextInt();
			if(personAge < 0) {
				System.out.println("Invalid input. Age must be positive and entered as number.");
			}
		} 
		System.out.println("Enter relation to person: ");
		personRelation = in.next();
		
		Person p = new Person(personAge, personName, personRelation);
			
		return p;
	}
	
	public String promptSort(Scanner in) {
		String rVal = "";
		// found out how to do below code here: 
		// https://howtodoinjava.com/java/collections/arraylist/add-multiple-elements-arraylist/
		ArrayList<String> validInputs = 
				new ArrayList<>(Arrays.asList("C", "D", "N", "DD", "PN", "A", "R", "I"));
		do {
			System.out.println("How do you wish to sort the task list?\n"
					+ "C - Sort by Complete\n"
					+ "TD - Sort by Description\n"
					+ "N - Sort by Task Name\n"
					+ "DD - Sort by Due Date\n"
					+ "PN - Sort by Person Name\n"
					+ "A - Sort by Person Age\n"
					+ "R - Sort by Relation to Person\n"
					+ "I - Invert current sorting order");
			rVal = in.next().toUpperCase();
			if(!validInputs.contains(rVal)) {
				System.out.println("Invalid input. Try again.");
			}
		} while(!validInputs.contains(rVal));
		
		return rVal;
	}
	
}
