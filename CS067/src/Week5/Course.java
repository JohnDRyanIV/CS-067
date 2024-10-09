/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 26, 2024
 */
package Week5;

/**
 * 
 */
public class Course {
	private String section;
	private int number;
	
	public Course() {
		setSection("CS");
		setNumber(67);
	}
	
	public Course(String section, int number) {
		setSection(section);
		setNumber(number);
	}
	
	public String toString() {
		// class number is formatted to include 3 nums before decimal
		return (getSection() + "-" + String.format("%03d", getNumber()));
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
}
