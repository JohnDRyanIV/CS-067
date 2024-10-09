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
public class ToDoListDriver {
	
	public static void main(String[] args) {
		Task testTask = new Task("Test task1", "this tests our task class");
		Task task2 = new Task("test2", "another test class");
		Task task3 = new Task("test3", "moretestx3");
		ArrayList<Task> allTasks = new ArrayList<Task>();
		allTasks.add(testTask);
		allTasks.add(task2);
		ToDoList todo = new ToDoList(allTasks);
		
		System.out.println(testTask.toString());
		testTask.markComplete();
		System.out.println(testTask.toString());
		
		System.out.println(todo);
		todo.addTask(task3);
		System.out.println(todo);

	}

}
