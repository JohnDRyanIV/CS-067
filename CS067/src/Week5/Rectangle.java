/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 24, 2024
 */
package Week5;

/**
 * 
 */
public class Rectangle {
	private double length;
	private double width;


    //default contructor -- no parameters
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    //another constructor -- it's okay to have more than one
    public Rectangle(double len, double w) {
        length = len;
        width = w;
    }

	public void setLength(double len) {
		length = len;
	}

    public double getLength() {
		return length;
	}
		
	public void setWidth(double w) {
		width = w;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length * width;
	}

}