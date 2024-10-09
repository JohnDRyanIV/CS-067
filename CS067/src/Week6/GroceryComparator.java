/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 3, 2024
 */
package Week6;

import java.util.Comparator;

/**
 * 
 */

class PriceComparator implements Comparator<GroceryItem> {
    public int compare(GroceryItem a, GroceryItem b) {
        return Double.compare(a.getPrice(), b.getPrice());
    }
}

class AisleComparator implements Comparator<GroceryItem> {
    public int compare(GroceryItem a, GroceryItem b) {
        return Integer.compare(a.getAisle(), b.getAisle());
    }
}

class NameComparator implements Comparator<GroceryItem> {
	public int compare(GroceryItem a, GroceryItem b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}
}
