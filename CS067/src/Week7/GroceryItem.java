package Week7;

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
    
    public String getName()
    {
    	return name;
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
}

class PriceComparator implements Comparator<GroceryItem> 
{
    public int compare(GroceryItem a, GroceryItem b) {
        return Double.compare(a.getPrice(), b.getPrice());
    }
}


class AisleComparator implements Comparator<GroceryItem> {
    public int compare(GroceryItem a, GroceryItem b) {
        return Integer.compare(a.getAisle(), b.getAisle());
    }
}