/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 24, 2024
 */
package Week5;

/**
 * 
 */
public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); //default constructor
        Rectangle r2 = new Rectangle(3.0, 4.0);
        Rectangle r4 = new Rectangle(5.0, 4.0);
        Rectangle r5 = new Rectangle(6.0, 12.0);
          
        System.out.println("The area of r1 is: " + r1.getArea());
        System.out.println("The area of r2 is: " + r2.getArea());
        System.out.println("The length of r4 is " + r4.getLength() + " and the width of r4 is " + r4.getWidth());
        System.out.println("The area of r4 is: " + r4.getArea());
        System.out.println("The length of r5 is " + r5.getLength() + " and the width of r5 is " + r5.getWidth());
        System.out.println("The area of r5 is: " + r5.getArea());
          
        r1.setLength(20);
        r1.setWidth(12);
          
        System.out.println("The NEW area of r1 is: " + r1.getArea());

        Rectangle r3 = new Rectangle(5.5,12.0);
        System.out.println("A rectangle with " + r3.getLength() + " length and " + r3.getWidth() + 
         " width has area " + r3.getArea());
    }
}
