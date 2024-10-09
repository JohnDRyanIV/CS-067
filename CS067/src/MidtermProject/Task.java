/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 1, 2024
 */
package MidtermProject;

import java.time.LocalDate;

/**
 * 
 */
public class Task {
	
	private String name;
	private String description;
	private boolean complete;
	private LocalDate dueDate;
	private Person person;
	
	// Constructors
	
	Task() {
		name = "epic";
		description = "epic";
		complete = false;
		dueDate = null;
		person = null;
	}
	
	Task(String name, String description) {
		this.name = name;
		this.description = description;
		complete = false;
		dueDate = null;
		person = null;
	}
	
	Task(String name, String description, Person person) {
		this.name = name;
		this.description = description;
		complete = false;
		dueDate = null;
		this.person = person;
	}
	
	Task(String name, String description, LocalDate dueDate) {
		this.name = name;
		this.description = description;
		complete = false;
		this.dueDate = dueDate;
		person = null;
	}
	
	Task(String name, String description, LocalDate dueDate, Person person) {
		this.name = name;
		this.description = description;
		complete = false;
		this.dueDate = dueDate;
		this.person = person;
	}
	
	public String toString() {
		
		String rVal = "";
			rVal = getName() + " | " + printComplete() + "\n" + getDescription() + "\n" + getPerson().toPrint();
			if(hasDueDate()) {
				rVal += " " + getDueDate().toString();
			}
		return rVal;
	}
	
	public void markComplete() {
		complete = true;
	}
	
	public void markIncomplete() {
		complete = false;
	}
	
	
	public String getName() {
		return name;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	/**
	 * @return - String description of task
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return - Boolean value representing completeness of task - true if complete, false otherwise
	 */
	public boolean getComplete() {
		if(complete)
			return true;
		return false;
	}
	
	/**
	 * @return - String value representing completeness of task
	 */
	public String printComplete() {
		if(complete) {
			return "Complete";
		}
		return "Incomplete";
		
	}
	
	public boolean hasDueDate() {
		return getDueDate() != null;
	}
	
	public Person getPerson() {
		return this.person;
	}

}
