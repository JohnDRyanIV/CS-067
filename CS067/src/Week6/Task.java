/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 1, 2024
 */
package Week6;

/**
 * 
 */
public class Task {
	
	private String name;
	private String description;
	private boolean complete;
	
	Task() {
		name = "epic";
		description = "epic";
		complete = false;
	}
	
	Task(String name, String description) {
		this.name = name;
		this.description = description;
		complete = false;
	}
	
	public String toString() {
		
		String rVal = "";
		if(!complete) {
			rVal = getName() + " | " + printComplete() + "\n" + getDescription();
		}
		else {
			//TODO strikethrough return text
			rVal = "";
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

}
