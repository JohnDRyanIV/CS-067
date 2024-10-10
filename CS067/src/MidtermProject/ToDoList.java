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
	private ArrayList<Person> people;
	
	public ToDoList() {
		tasks = new ArrayList<Task>();
	}
	
	public ToDoList(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public ToDoList(ArrayList<Task> tasks, ArrayList<Person> people) {
		this.tasks = tasks;
		this.people = people;
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
	
	public void addPerson(Person newPerson) {
		people.add(newPerson);
	}
	
	/**
	 * Reverses order of list. This can be useful for changing from ascending to descending sort
	 */
	public void reverseOrder() {
		Collections.reverse(tasks);
	}
	
	public void removeTask(int i) {
		// TODO order all tasks with num next to them representing index of task list that task is in
		tasks.remove(i);
	}
	
	public Task getTask(int i) {
		return tasks.get(i);
	}
	
	public ArrayList<Task> getTasks() {
		return tasks;
	}
	
	public Person getPerson(int i) {
		return people.get(i);
	}
	
	public String listCompleteTasks() {
		String rVal = "";
		int i = 1;	// Outputs the number of task on the completed list this is
		for(Task t : tasks) {
			if(t.isComplete()) {
				rVal += String.valueOf(i) + ": ";
				rVal += t.shortToString();
				i++;
			}

		}
		
		return rVal;
	}
	
	public String listIncompleteTasks() {
		String rVal = "";
		int i = 1;	// Outputs the number of task on the incomplete list this is
		for(Task t : tasks) {
			if(!t.isComplete()) {
				rVal += String.valueOf(i) + ": " + t.shortToString();
				i++;
			}

		}
		
		return rVal;
	}
	
	public String listAllTasks() {
		String rVal = "";
		int i = 1;
		for(Task t : tasks) {
			rVal += String.valueOf(i) + ": " + t.shortToString() + "\n";
			i++;
		}
		
		return rVal;
	}
	
	public String listAllPeople() {
		String rVal = "";
		int i = 1;
		for(Person p : people) {
			rVal += String.valueOf(i) + ": " + p.toString() + "\n";
			i++;
		}
		
		return rVal;
	}
	
	public int getNumTasks() {
		return tasks.size();
	}
	
	public int getNumPeople() {
		return people.size();
	}
	
	public boolean isValidTaskSelect(int taskNum) {		
		if(taskNum > -1 && taskNum < tasks.size()) {
			return true;
		}
		return false;
	}
	
	public boolean isValidPersonSelect(int personNum) {
		if(personNum > -1 && personNum < people.size()) {
			return true;
		}
		return false;
		
	}
	
	
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
