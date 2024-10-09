/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 8, 2024
 */
package MidtermProject;

/**
 * 
 */
public class Person {
	
	private int age;
	private String name;
	private String relation;
	
	public Person() {
		this.age = 25;
		this.name = "John Doe";
		this.relation = "Cousin";
	}
	
	public Person(int age, String name, String relation) {
		this.age = age;
		this.name = name;
		this.relation = relation;
	}

	/**
	 * @param person
	 * @return
	 */
	public int compareTo(Person person) {
		return this.name.compareTo(person.getName());
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * @param relation the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public String toString() {
		return "Person [getAge()=" + getAge() + ", getName()=" + getName() + ", getRelation()=" + getRelation() + "]";
	}
	
	public String toPrint() {
		return this.getName();
	}
	
}
