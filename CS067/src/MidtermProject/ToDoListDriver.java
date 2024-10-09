/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 1, 2024
 */
package MidtermProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */
public class ToDoListDriver {
	
	public static void main(String[] args) {
		String sentinelValue = "z";
		String tempInput = "";
		Scanner in = new Scanner(System.in);
		PromptController prompt = new PromptController();
		Task currentTask = null;
		Person currentPerson = null;
		/**
		 * Might implement below for file reading/writing
		 * Scanner file = new Scanner(-FILEPATH-);
		 */
		ToDoList toDo = new ToDoList();
		
		System.out.println("Enter a to add a task, b to add a person, or z to end the program: ");
		tempInput = in.next();
		
		while(tempInput != sentinelValue) {
			if(tempInput.toLowerCase().equals("a")) {
				currentTask = prompt.promptTask();
			}
			else if (tempInput.toLowerCase().equals("b")) {
				// TODO add a person
			}
			else if(!tempInput.toLowerCase().equals("z")) {
				System.out.println("Invalid input. Try again.");
			}
			
			System.out.println("Enter a to add a task, b to add a person, or z to end the program: ");
			tempInput = in.next();
		}
		
		
		Task testTask = new Task("test1", "this tests our task class");
		Task task2 = new Task("test2", "another test class");
		Task task3 = new Task("test3", "moretestx3");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate due = LocalDate.parse("2024-04-05", formatter);
		Task task4 = new Task("test4", "epictasktimeactivate", due);
		ArrayList<Task> allTasks = new ArrayList<Task>();
		allTasks.add(testTask);
		allTasks.add(task2);
		allTasks.add(task3);
		allTasks.add(task4);
		
		task2.markComplete();
		task4.markComplete();
		ToDoList todo = new ToDoList(allTasks);
		
		System.out.println(todo);
		Collections.sort(allTasks, new CompleteComparator());
		System.out.println(todo);

		Collections.sort(allTasks, new DescriptionComparator());
		System.out.println(todo);

		Collections.sort(allTasks, new NameComparator());
		System.out.println(todo);

		Collections.sort(allTasks, new DueDateComparator());

	}

}
