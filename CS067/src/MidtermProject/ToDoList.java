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
	
	public ArrayList<Task> getTasks() {
		return tasks;
	}
	
	/**public String listCompleteTasks() {
		String rVal = "";
		int i = 1;	// Outputs the task to be selected
		for(Task t : tasks) {
			if(t.isComplete()) {
				rVal += String.valueOf(i) + ": ";
				rVal +=  
			}
			i++;
		}
	}*/
	
	public String shortToString() {
		int taskNum = 1;
		String rVal = "";
		for(Task t : tasks) {
			rVal += String.valueOf(taskNum) + ": " + t.shortToString() + "\n";
			taskNum++;
		}
		
		return rVal;
	}

}
