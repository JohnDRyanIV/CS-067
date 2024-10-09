/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 1, 2024
 */
package MidtermProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */
public class ToDoList {
	
	private ArrayList<Task> tasks;
	
	public ToDoList() {
		tasks = new ArrayList<Task>();
	}
	
	public ToDoList(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public String toString() {
		String rVal = "";
		for(Task t : tasks) {
			rVal += t + "\n";
		}
		
		return rVal;
	}
	
	/**
	 * Adds a Task to the ToDoList object
	 * @param newTask - Task to be added to the ToDoList object
	 */
	public void addTask(Task newTask) {
		tasks.add(newTask);
	}
	
	// Prompts user to enter task then adds task to the list
	
	
	/**
	 * Reverses order of list. This can be useful for changing from ascending to descending sort
	 */
	public void reverseOrder() {
		Collections.reverse(tasks);
	}
	
	public void removeTask() {
		// TODO order all tasks with num next to them representing index of task list that task is in
		Scanner in = new Scanner(System.in);
		
		in.close();
	}

}
