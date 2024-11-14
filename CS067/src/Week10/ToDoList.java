/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 29, 2024
 */
package Week10;


import java.util.ArrayList;

public class ToDoList extends ArrayList<Task>
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
