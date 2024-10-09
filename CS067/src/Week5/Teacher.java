/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 26, 2024
 */
package Week5;

/**
 * 
 */
public class Teacher {
	private String name;
	private Course course;
	
	public Teacher() {
		this.name = "Eric Manley";
		this.course = new Course();
		
	}
	
	public Teacher(String name, Course course) {
		this.name = name;
		this.course = course;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	public String toString() {
		return (getName() + " teaches " + getCourse());
	}

}
