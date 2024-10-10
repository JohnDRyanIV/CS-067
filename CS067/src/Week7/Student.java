/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 8, 2024
 */
package Week7;

public class Student extends Person {

    private double gpa;

    /**
     * Constructor for a Student
     *
     * @param n , String for the name
     * @param m , String for the month for birthday
     * @param d , int for day for birthday
     * @param y ,  int for year for birthday
     * @param g ,  double for gpa
     */
    public Student(String n, int y, int m, int d, double g) {
        super(n,y,m,d);
        gpa = g;
    }
    
    /**
     * @return String representation of a Student 
     */
    public String toString(){ 
        String returnString = "";
        returnString += "STUDENT\n";
        returnString += "  name: " + name + "\n";
        returnString += "  age: " + getAge() + "\n";
        returnString += "  gpa: " + gpa + "\n";
        return returnString;
    }
}
