/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 1, 2024
 */
package Week6;

import java.util.ArrayList;

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
		String rval = "";
		for(Task t : tasks) {
			rval += t + "\n";
		}
		
		return rval;
	}
	
	public void addTask(Task newTask) {
		tasks.add(newTask);
	}

}
