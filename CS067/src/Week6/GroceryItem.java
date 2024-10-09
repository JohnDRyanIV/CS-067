/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 3, 2024
 */
package Week6;

import java.lang.Comparable;
import java.util.Comparator;

public class GroceryItem implements Comparable<GroceryItem>
{
    private String name;
    private double price;
    private int aisle;

    public GroceryItem(String n, double p, int a)
    {
        name = n;
        price = p;
        aisle = a;
    }

    public double getPrice()
    {
        return price;
    }

    public int getAisle()
    {
        return aisle;
    }

    public String toString()
    {
        String rVal = String.format("\n%s: %.2f; Aisle %d",name,price,aisle);
        return rVal;
    }

    // by default, compare using the names
    public int compareTo(GroceryItem other)
    {
        return name.compareTo(other.name);
    }

	/**
	 * @return
	 */
	public String getName() {
		return this.name;
	}
}

    

