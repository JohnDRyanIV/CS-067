/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 5, 2024
 */
package Week11;

import java.io.Serializable;

public class Task implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4084898417981644974L;
	private String name;
    private String description;
    private boolean complete;

    public Task(String n, String d)
    {
        name = n;
        description = d;
        complete = false;
    }

    public String toString()
    {
        String rVal = name+"\n"+description+"\n"+"Complete? "+complete+"\n";
        return rVal;
    }

    public String getName()
    {
        return name;
    }

    public void markComplete()
    {
        complete = true;
    }

    public void markIncomplete()
    {
        complete = false;
    }

    public Boolean isComplete()
    {
        return complete;
    }
}

