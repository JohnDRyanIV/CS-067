/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 3, 2024
 */
package Week7;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryDriver 
{
    public static void main(String[] args) 
    {
        ArrayList<GroceryItem> shoppingList = new ArrayList<GroceryItem>();

        GroceryItem flour = new GroceryItem("Flour, 5 lbs", 4.57, 16);
        GroceryItem milk = new GroceryItem("Milk 1%", 2.75, 36);
        GroceryItem granola = new GroceryItem("Granola 11 oz.", 4.47, 19);
        GroceryItem peanutButter = new GroceryItem("Peanut Butter (creamy), 40 oz.", 3.98, 9);
        GroceryItem bread = new GroceryItem("Whole Wheat Sandwich Bread", 1.97,8);

        shoppingList.add(flour);
        shoppingList.add(milk);
        shoppingList.add(granola);
        shoppingList.add(peanutButter);
        shoppingList.add(bread);

        System.out.println(shoppingList);

        System.out.println("\n\nSorting by name:");
        Collections.sort(shoppingList);
        System.out.println(shoppingList);

        System.out.println("\n\nSorting by price:");
        Collections.sort(shoppingList,new PriceComparator());
        System.out.println(shoppingList);

        System.out.println("\n\nSorting by aisle:");
        Collections.sort(shoppingList,new AisleComparator());
        System.out.println(shoppingList);
        
        System.out.println("\n\nSorting by name:");
        Collections.sort(shoppingList,new NameComparator());
        System.out.println(shoppingList);

    }
}
