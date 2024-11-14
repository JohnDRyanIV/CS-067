/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 5, 2024
 */
package Week11;


import java.io.Serializable;
import java.util.ArrayList;

public class ToDoList extends ArrayList<Task> implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1438464988513938186L;

	public ToDoList()
    {
        super();
    }

    public String toString()
    {
        String rVal = "";
        for( Task t : this)
        {
            rVal += t;
            rVal += "\n";
        }
        return rVal;
    }

    public void addTask(Task newTask) 
    {
        this.add(newTask);
    }


}

