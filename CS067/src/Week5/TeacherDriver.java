/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 26, 2024
 */
package Week5;

/**
 * 
 */
public class TeacherDriver {
	
	public static void main(String[] args) {
		// Create teacher using default constructor, which uses default course constructor
		Teacher teacher1 = new Teacher();
		
		Course course2 = new Course("AI", 1);
		Teacher teacher2 = new Teacher("Christopher Porter", course2);
		
		System.out.println(teacher1);
		System.out.println(teacher2);
	}
}
