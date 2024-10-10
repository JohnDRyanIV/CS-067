/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 8, 2024
 */
package Week7;

import java.time.LocalDate;
import java.time.Period;

public class Person {
 
    protected LocalDate birthday;
    protected String name;

    public Person(String n, int y, int m, int d) {
        name = n;
        birthday = LocalDate.of(y, m, d);
    }

    public Person(String n, LocalDate d) {
        name = n;
        birthday = d;
    }

    public int getAge()
    {
        LocalDate today = LocalDate.now();  // Get the current date
        return Period.between(birthday, today).getYears();  // Calculate the difference in years
    }

    public String toString(){ 
        String returnString = "";
        returnString += "PERSON\n";
        returnString += "  name: " + name + "\n";
        returnString += "  age: " + getAge() + "\n";
        return returnString;
    }

}
