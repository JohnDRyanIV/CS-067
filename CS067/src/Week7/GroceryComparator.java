/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 3, 2024
 */
package Week7;

import java.util.Comparator;

/**
 * 
 */

class NameComparator implements Comparator<GroceryItem> {
	public int compare(GroceryItem a, GroceryItem b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}
}
