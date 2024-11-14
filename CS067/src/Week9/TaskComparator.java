/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 3, 2024
 */
package Week9;

import java.util.Comparator;


/**
 * This class consists of comparator overrides to sort task list by a lot of different variables
 */

class CompleteComparator implements Comparator<Task> {	
	@Override
	/**
	 * Sorts tasks based on if they are complete or not
	 */
	public int compare(Task o1, Task o2) {
		return Boolean.compare(o1.isComplete(), o2.isComplete());
	}
}

class DescriptionComparator implements Comparator<Task> {
	@Override
	/**
	 * Sorts tasks based on their description, ascending.
	 */
	public int compare(Task o1, Task o2) {
		return o1.getDescription().toLowerCase().compareTo(o2.getDescription().toLowerCase());
	}
	
}

class NameComparator implements Comparator<Task> {
	@Override
	/**
	 * Sorts tasks based on their name, ascending
	 */
	public int compare(Task o1, Task o2) {
		return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
	}
	
}
