/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 1, 2024
 */
package MidtermProject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A to do list that contains Task and Person objects. Many operations can be performed on this object
 */
public class ToDoList {
	
	private ArrayList<Task> tasks;		// ArrayList containing Task objects
	private ArrayList<Person> people;	// ArrayList containing Person objects
	
	////// Constructors ///////
	
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
	 * Adds a Task object to the tasks ArrayList
	 * @param newTask - Task to be added to the ToDoList
	 */
	public void addTask(Task newTask) {
		tasks.add(newTask);
	}
	
	/**
	 * Adds a Person object to the people ArrayList
	 * @param newPerson - Person to be added to people ArrayList
	 */
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
	
	/**
	 * Returns the task at index i of tasks
	 * @param i - index of task to be returned
	 * @return - task at index i
	 */
	public Task getTask(int i) {
		return tasks.get(i);
	}
	
	/**
	 * Returns the entire arrayList of tasks
	 * @return - ArrayList tasks
	 */
	public ArrayList<Task> getTasks() {
		return tasks;
	}
	
	/**
	 * Returns the person at index i of people
	 * @param i - index of person to be returned
	 * @return - person at index i
	 */
	public Person getPerson(int i) {
		return people.get(i);
	}
	
	/**
	 * Compiles string of all complete tasks in short-form
	 * @return - string of all completed tasks in short-form
	 */
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
	
	/**
	 * @return - String of all incomplete tasks in short-form
	 */
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
	
	/**
	 * @return - String that lists all tasks in short-form
	 */
	public String listAllTasks() {
		String rVal = "";
		int i = 1;
		for(Task t : tasks) {
			rVal += String.valueOf(i) + ": " + t.shortToString() + "\n";
			i++;
		}
		
		return rVal;
	}
	
	/**
	 * @return - String that lists all Person objects in people
	 */
	public String listAllPeople() {
		String rVal = "";
		int i = 1;
		for(Person p : people) {
			rVal += String.valueOf(i) + ": " + p.toString() + "\n";
			i++;
		}
		
		return rVal;
	}
	
	/**
	 * @return - size of ArrayList tasks
	 */
	public int getNumTasks() {
		return tasks.size();
	}
	
	/**
	 * @return - size of ArrayList people
	 */
	public int getNumPeople() {
		return people.size();
	}
	
	/**
	 * Checks if the selected index taskNum of ArrayList tasks is a valid index
	 * @param taskNum - Index of tasks attempting to be accessed
	 * @return - true if index exists in tasks, false otherwise
	 */
	public boolean isValidTaskSelect(int taskNum) {		
		if(taskNum > -1 && taskNum < tasks.size()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if the selected index personNum of ArrayList people is a valid index
	 * @param personNum - Index of people attempting to be accessed
	 * @return - true if index exists in people, false otherwise
	 */
	public boolean isValidPersonSelect(int personNum) {
		if(personNum > -1 && personNum < people.size()) {
			return true;
		}
		return false;
		
	}
	
	/**
	 * Returns a shorthand representation of the ToDoList for easy modification
	 * @return - String representing shorthand form of ToDoList
	 */
	public String shortToString() {
		int taskNum = 1;
		String rVal = "";
		for(Task t : tasks) {
			rVal += String.valueOf(taskNum) + ": " + t.shortToString() + "\n";
			taskNum++;
		}
		
		return rVal;
	}
	
	/**
	 * @return - Verbose toString of all Task objects for later reference by user at end of program
	 */
	public String longToString() {
		int taskNum = 1;
		String rVal = "List of Tasks:\n";
		for(Task t : tasks) {
			rVal += String.valueOf(taskNum) + t + "\n";
			taskNum++;
		}
		
		return rVal;
	}

}
