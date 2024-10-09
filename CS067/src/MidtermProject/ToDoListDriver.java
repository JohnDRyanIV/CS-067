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

/**
 * 
 */
public class ToDoListDriver {
	
	public static void main(String[] args) {
		String sentinelValue = "z";							// Value to end the input loop
		String tempInput = "";								// Value to hold current user input
		String sortInput = "";
		Scanner in = new Scanner(System.in);					// Scanner to scan for current user input
		PromptController prompt = new PromptController();		// Handles getting input frmo user
		Task currentTask = null;								// Current task to be added to ToDoList
		Person currentPerson = null;							// Current person to be added to PersonList
		ToDoList toDo = null;
		ArrayList<Person> people = new ArrayList<Person>();
		/**
		 * Might implement below for file reading/writing
		 * Scanner file = new Scanner(-FILEPATH-);
		 */
		
		toDo = testPopulate();
		
		
		
		/**do {
			
			System.out.println(toDo.shortToString());
			System.out.println("Enter the following:\n"
					+ "A - Add a Task\n"
					+ "P - Add a Person\n"
					+ "D - Delete a Task\n"
					+ "S - Sort Task List\n"
					+ "C - View Complete Tasks\n"
					+ "I - View Incomplete Tasks\n"
					+ " or z to end the program: ");
			tempInput = in.next();
			if(tempInput.equalsIgnoreCase("a")) {
				toDo.addTask(prompt.promptTask());
			}
			else if (tempInput.equalsIgnoreCase("p")) {
				people.add(prompt.promptPerson());
			}
			else if (tempInput.equalsIgnoreCase("d")) {
				// TODO delete task
			}
			else if (tempInput.equalsIgnoreCase("s")) {
				sortInput = prompt.promptSort();
				if(sortInput.equals("C")) {
					
				}
				else if(sortInput.equals("D")) {
					
				}
				else if(sortInput.equals("N")) {
					
				}
				else if(sortInput.equals("DD")) {
					
				}
				else if(sortInput.equals("PN")) {
					
				}
				else if(sortInput.equals("A")) {
					
				}
				else if(sortInput.equals("R")) {
					
				}
				else if(sortInput.equals("I")) {
					toDo.reverseOrder();
				}
			}
			else if (tempInput.equalsIgnoreCase("c")) {
				// TODO view complete tasks
			}
			else if (tempInput.equalsIgnoreCase("i")) {
				// TODO view incompelete tasks
			}
			else if(!tempInput.equalsIgnoreCase("z")) {
				System.out.println("Invalid input. Try again.");
			}
			
		} while(tempInput != sentinelValue);*/
		
		in.close();
		
		
		System.out.println(toDo.shortToString());
		Collections.sort(toDo.getTasks(), new CompleteComparator());
		System.out.println(toDo.shortToString());

		Collections.sort(toDo.getTasks(), new DescriptionComparator());
		System.out.println(toDo.shortToString());

		Collections.sort(toDo.getTasks(), new NameComparator());
		System.out.println(toDo.shortToString());

		Collections.sort(toDo.getTasks(), new DueDateComparator());
		System.out.println(toDo.shortToString());
		
		Collections.sort(toDo.getTasks(), new PersonNameComparator());
		System.out.println(toDo.shortToString());



	}
	
	public static ToDoList testPopulate() {
		Task task1, task2, task3, task4, task5, task6;
		Person person1, person2, person3;
		
		LocalDate now = LocalDate.now();
		LocalDate before = LocalDate.of(2022, 1, 4);
		LocalDate after = LocalDate.of(2026, 5, 10);
		
		person1 = new Person();
		person2 = new Person(41, "Jim Bonacci", "Acquaintance");
		person3 = new Person(56, "Jack Ryan", "Father");
		
		
		task1 = new Task();
		task2 = new Task("Mow Lawn", "Mow the lawn", after, person3);
		task3 = new Task("Moving", "Help with moving", now, person2);
		task4 = new Task("Walk dog", "walk the dog", before, person1);
		task5 = new Task("smthn", "idk lol", LocalDate.of(2025, 2, 2));
		task6 = new Task("another thig", "texthere", person1);
		

		ArrayList<Task> allTasks = new ArrayList<Task>();
		allTasks.add(task1);
		allTasks.add(task2);
		allTasks.add(task3);
		allTasks.add(task4);
		allTasks.add(task5);
		allTasks.add(task6);
		
		ArrayList<Person> allPeople = new ArrayList<Person>();
		allPeople.add(person1);
		allPeople.add(person2);
		allPeople.add(person3);
		
		
		ToDoList toDo = new ToDoList(allTasks, allPeople);
		
		return toDo;
		
		
	}

}
