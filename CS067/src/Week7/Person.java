/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 8, 2024
 */
package Week7;

public class Person { 
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void setName(String n) {
        name =n;
    }

    public void setAge(int a) {
        age =a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        String returnString = "";
        returnString += "PERSON\n";
        returnString += "  name: " + name + "\n";
        returnString += "  age: " + age + "\n";
        return returnString;
    }
}
