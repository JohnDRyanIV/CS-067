/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 5, 2024
 */
package Week11;


/**
 * A class that can be serialized.
 */

import java.io.Serializable;

public class MyClass implements Serializable {
    private int number;

    public MyClass(int n) {
        number = n;
    }

    public String toString() {
        return "The number is " + number;
    }

}

