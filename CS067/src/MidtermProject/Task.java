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
	
	private String name;			// Name of Task (label)
	private String description;	// Description of what task entails
	private boolean complete;	// Boolean keeping track of if task is complete
	private LocalDate dueDate;	// Due Date of task
	private Person person;		// Person involved with task
		
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
			rVal = getName() + " | " + printComplete() + "\n" + getDescription() + "\n";
			if(hasDueDate()) {
				rVal += " " + getDueDate().toString();
			}
			if(hasPerson()) {
				rVal += " " + getPerson().toString();
			}
		return rVal;
	}
	
	
	/**
	 * Returns a short string representing a task
	 */
	public String shortToString() {
		String rVal = "";
		rVal += getName() + " | ";
		if(hasDueDate()) {
			rVal += getDueDate().toString() + " | ";
		}
		if(hasPerson()) {
			rVal += getPerson().toPrint()+ " | ";
		}
		rVal += printComplete();
		
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
	public boolean isComplete() {
		return complete;
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
	
	/**
	 * @return - Person object associated with this task
	 */
	public Person getPerson() {
		return this.person;
	}
	
	/**
	 * @return - True if this task has a person associated with it, false otherwise
	 */
	public boolean hasPerson() {
		return(getPerson() != null);
	}

}
