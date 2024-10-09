/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 24, 2024
 */
package Week5;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this.day = 5;
		this.month = 4;
		this.year = 1998;
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return (this.month + "/" + this.day + "/"+ this.year);
	}
}
