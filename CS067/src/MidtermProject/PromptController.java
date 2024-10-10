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
 * Handles a lot of prompting for and receiving inputs from the user.
 */
public class PromptController {

	/**
	 * Prompts the user to enter information that can be used to create a new Task object
	 * @return - New task created by user through console
	 */
	public Task promptTask(Scanner in, ToDoList todo) {
		int tempInt = -1;
		String tempInput = "";
		String taskName = "";
		String taskDescription = "";
		String dueDateHolder = "";
		LocalDate taskDueDate = null;
		Task rTask = null;
		Person p = null;
		
		// Enter the name of the task
		System.out.println("Enter title of task: ");
		taskName = in.nextLine();
		// Enter the description of the task
		System.out.println("Enter description of task: ");
		taskDescription = in.nextLine();
		// Enter date of the task, if asked for, otherwise date = null;
		System.out.println("Do you want to enter a due date for the task (y/n)?: ");
		tempInput = in.nextLine();
		// Input validation
		while(!tempInput.equalsIgnoreCase("y") && !tempInput.equalsIgnoreCase("n")) {
			System.out.println("Invalid input. Try again: ");
			tempInput = in.nextLine();
		}
		// If date is added
		if(tempInput.equalsIgnoreCase("y")) {
			System.out.println("Enter date of task (yyyy-mm-dd): ");
			dueDateHolder = in.nextLine();
			
			while(taskDueDate == null) {
				try {
					// following code found here: https://stackoverflow.com/questions/8746084/string-to-localdate
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					formatter = formatter.withLocale(Locale.US);  
					// Locale specifies human language for translating, and cultural norms for lowercase/uppercase 
					// and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
					taskDueDate = LocalDate.parse(dueDateHolder, formatter);
				}
				catch(Exception e) {
					System.out.println("Error in entered date. Try again (yyyy-mm-dd): ");
					dueDateHolder = in.nextLine();
				}
			}
		}
		
		tempInput = "";
		// Input for if user wants to add person
		System.out.println("Do you want to add a person (y/n)?: ");
		tempInput = in.nextLine();
		if(!tempInput.equalsIgnoreCase("y") && !tempInput.equalsIgnoreCase("n")) {
			while(!tempInput.equalsIgnoreCase("y") && !tempInput.equalsIgnoreCase("n")) {
				System.out.println("Invalid input. Try again.");
				tempInput = in.nextLine();
			}
		}	
		// If user wants to add person
		if(tempInput.equalsIgnoreCase("y")) {
			tempInput = "";
			// Enter person either from existing list or create new person
			if(todo.getNumPeople() > 0) { // Check to see if there exist people in persons list to choose from
				System.out.println("Do you want to use an existing person (y/n)?");
				tempInput = in.nextLine();
				if(!tempInput.equalsIgnoreCase("y") && !tempInput.equalsIgnoreCase("n")) {
					while(!tempInput.equalsIgnoreCase("y") && !tempInput.equalsIgnoreCase("n")) {
						System.out.println("Invalid input. Try again.");
						tempInput = in.nextLine();
					}
				}	
			}
			// If person list is empty, manually set tempinput to n so user will be prompted to enter new person
			else {
				tempInput = "n";
			}
			// If yes, then get list of existing people and choose which one to add
			if(tempInput.equalsIgnoreCase("y")) {
				System.out.println(todo.listAllPeople());

				System.out.println("Select a person: ");
				tempInt = in.nextInt() - 1;
				// Input validation
				while(!todo.isValidPersonSelect(tempInt)) {
					System.out.println("Invalid input. Try again");
					tempInt = in.nextInt() - 1;
				}
				in.nextLine();
				p = todo.getPerson(tempInt);		
			}
			// If no or no users, prompt user to manually add a person
			else {
				p = promptPerson(in, todo);
			}
			
			todo.addPerson(p);
		}
		
		
		if(taskDueDate != null && p != null) {
			rTask = new Task(taskName, taskDescription, taskDueDate, p);
		}
		else if(taskDueDate != null) {
			rTask = new Task(taskName, taskDescription, taskDueDate);
		}
		else if(p != null) {
			rTask = new Task(taskName, taskDescription, p);
		}
		else {
			rTask = new Task(taskName, taskDescription);
		}
		
		return rTask;
	}
	
	/**
	 * Prompts the user to enter information that can be used to make a new person object
	 * @return - Person object created by user
	 */
	public Person promptPerson(Scanner in, ToDoList todo) {
		
		String personName = "";
		int personAge = -1;
		String personRelation = "";
			
		System.out.println("Enter name of person: ");
		personName = in.nextLine();
		System.out.println("Enter relation to person: ");
		personRelation = in.nextLine();
		while(personAge < 0) {
			System.out.println("Enter age of person: ");
			personAge = in.nextInt();
			if(personAge < 0) {
				System.out.println("Error. Age must be above 0");
			}
		
		}

			
		Person p = new Person(personAge, personName, personRelation);
		
		return p;
	}
	
	/**
	 * Prompts the user as to what kind of method they want to use to sort the tasks in the ToDoList
	 * @param in - Scanner
	 * @return - String representing the type of sorting to be used
	 */
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
			rVal = in.nextLine().toUpperCase();
			if(!validInputs.contains(rVal)) {
				System.out.println("Invalid input. Try again.");
			}
		} while(!validInputs.contains(rVal));
		
		return rVal;
	}
	
}
