/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 3, 2024
 */
package MidtermProject;

import java.util.Comparator;


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
		return o1.getDescription().compareTo(o2.getDescription());
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

class DueDateComparator implements Comparator<Task> {
	@Override
	/**
	 * Sorts tasks based on their due date, ascending.
	 */
	public int compare(Task o1, Task o2) {
		if(o1.getDueDate() != null && o2.getDueDate() != null) {
			return o1.getDueDate().compareTo(o2.getDueDate());
		}
		else if(o1.getDueDate() == null && o2.getDueDate() == null) {
			return 0;
		}
		else if(o1.getDueDate() == null && o2.getDueDate() != null) {
			return -1;
		}
		return 1; // TODO TODO TODO TODO
	}
}
	
class PersonNameComparator implements Comparator<Task> {
	@Override
	/**
	 * Sorts tasks based on the name of person
	 */
	public int compare(Task o1, Task o2) {
		Person p1 = o1.getPerson();
		Person p2 = o2.getPerson();
		if(p1 != null && p2 != null) {
			return p1.getName().toLowerCase().compareTo
					(p2.getName().toLowerCase());
		}
		else if (p1 == null && p2 == null) {
			return 0;
		}
		else if (p1 == null && p2 != null) {
			return -1;
		}
		return 1; // TODO TODO TODO TODO 
	}
}
	
class AgeComparator implements Comparator<Task> {
	@Override
	/**
	 * Sorts tasks based on the age of the 
	 */
	public int compare(Task o1, Task o2) {
		Person p1 = o1.getPerson();
		Person p2 = o2.getPerson();
		if(p1 != null && p2 != null) {
			return Integer.valueOf(p1.getAge()).compareTo
					(Integer.valueOf(p2.getAge()));
		}
		else if (p1 == null && p2 == null) {
			return 0;
		}
		else if(p1 == null && p2 != null) {
			return -1;
		}
		return 1; // TODO TODO TODO TODO 
	}
}

class RelationComparator implements Comparator<Task> {
	@Override
	/**
	 * Sorts tasks based on the relationship to the person
	 */
	public int compare(Task o1, Task o2) {
		Person p1 = o1.getPerson();
		Person p2 = o2.getPerson();
		if(p1 != null && p2 != null) {
			return p1.getRelation().compareTo(p2.getRelation());
		}
		else if (p1 == null && p2 == null) {
			return 0;
		}
		else if (p1 == null && p2 != null) {
			return -1;
		}
		return 1; // TODO TODO TODO TODO 
	}
}
