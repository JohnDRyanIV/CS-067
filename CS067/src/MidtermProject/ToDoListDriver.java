/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 1, 2024
 */
package MidtermProject;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 */
public class ToDoListDriver {
	
	public static void main(String[] args) {

		int tempIntInput = -1;
		
		String sentinelValue = "z";							// Value to end the input loop
		String tempInput = "";								// Value to hold current user input
		String sortInput = "";								// value to hold current user sort input
		
		Scanner in = new Scanner(System.in);					// Scanner to scan for current user input
		
		PromptController prompt = new PromptController();		// Handles getting some input from user
		
		Task currentTask = null;								// Current task to be added to ToDoList
		Person currentPerson = null;							// Current person to be added to PersonList
		ToDoList toDo = null;
		Save_Load sl = new Save_Load();						// Handles saving/loading todolist

		
		
		/**
		 * Might implement below for file reading/writing
		 * Scanner file = new Scanner(-FILEPATH-);
		 */
		
		//toDo = testPopulate();
		
		toDo = sl.loadToDoList();
		
		
		do {
			
			System.out.println(toDo.shortToString());
			System.out.println("Enter the following:\n"
					+ "A - Add a Task\n"
					+ "P - Add a Person\n"
					+ "T - Toggle Task Completion\n"
					+ "DT - Delete a Task\n"
					+ "S - Sort Task List\n"
					+ "C - View Complete Tasks\n"
					+ "I - View Incomplete Tasks\n"
					+ "V - View People\n"
					+ " or z to end the program: ");
			tempInput = in.next();
			// Add a task
			if(tempInput.equalsIgnoreCase("A")) {
				toDo.addTask(prompt.promptTask(in));
				sl.saveToDoList(toDo);
			}
			// Add a person
			else if (tempInput.equalsIgnoreCase("P")) {
				toDo.addPerson(prompt.promptPerson(in));
			}
			// Change completion status of task
			else if (tempInput.equalsIgnoreCase("T")) {
				System.out.println(toDo.listAllTasks());
				System.out.println("Select which number task you want deleted: " );
				tempIntInput = in.nextInt() - 1;		// subtracted by 1 cause user is shown list from 1-size
													// whereas actual valid indices are 0-(size - 1)
				while(!toDo.isValidTaskSelect(tempIntInput)) {
					System.out.println("Invalid input. Try again.");
					tempIntInput = in.nextInt() - 1;
				}
				toDo.removeTask(tempIntInput);
				sl.saveToDoList(toDo);
			}
			// Delete a task
			else if (tempInput.equalsIgnoreCase("DT")) {
				System.out.println(toDo.listAllTasks());
				System.out.println("Select which number task you want deleted: " );
				tempIntInput = in.nextInt() - 1;		// subtracted by 1 cause user is shown list from 1-size
													// whereas actual valid indices are 0-(size - 1)
				while(!toDo.isValidTaskSelect(tempIntInput)) {
					System.out.println("Invalid input. Try again.");
					tempIntInput = in.nextInt() - 1;
				}
				toDo.removeTask(tempIntInput);
				sl.saveToDoList(toDo);
			}
			// Sort task list
			else if (tempInput.equalsIgnoreCase("S")) {
				sortInput = prompt.promptSort(in);
				if(sortInput.equals("C")) {	// Sort by complete
					Collections.sort(toDo.getTasks(), new CompleteComparator());
				}
				else if(sortInput.equals("D")) { // Sort by description
					Collections.sort(toDo.getTasks(), new DescriptionComparator());
				}
				else if(sortInput.equals("N")) { // Sort by task name
					Collections.sort(toDo.getTasks(), new NameComparator());
				}
				else if(sortInput.equals("DD")) { // Sort by due date
					Collections.sort(toDo.getTasks(), new DueDateComparator());
				}
				else if(sortInput.equals("PN")) { // Sort by person name
					Collections.sort(toDo.getTasks(), new PersonNameComparator());
				}
				else if(sortInput.equals("A")) { // Sort by person age
					Collections.sort(toDo.getTasks(), new AgeComparator());
				}
				else if(sortInput.equals("R")) { // Sort by relation to person
					Collections.sort(toDo.getTasks(), new RelationComparator());
				}
				else if(sortInput.equals("I")) { // Invert current sorting order
					toDo.reverseOrder();
				}
			}
			// View complete tasks
			else if (tempInput.equalsIgnoreCase("C")) {
				System.out.println(toDo.listCompleteTasks());
			}
			// View iocomplete tasks
			else if (tempInput.equalsIgnoreCase("I")) {
				System.out.println(toDo.listIncompleteTasks());
			}
			// View all people
			else if(tempInput.equalsIgnoreCase("V")) {
				System.out.println(toDo.listAllPeople());
			}
			else if(!tempInput.equalsIgnoreCase("Z")) {
				System.out.println("Invalid input. Try again.");
			}
			
		} while(!tempInput.equals(sentinelValue));
		
		in.close();


	}

}
