/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 10, 2024
 */
package Week7;

/**
 * 
 */
public class PersonHierarchyDriver {

	public static void main(String[] args) {

		// Let's create a Person variable an initialize it to a Professor named Alice.
		// Why can we assign a Professor to a variable of type Person?
		Person p1 = new Professor("Alice", "Mathematics", 1979, 3, 14);
				
		// Let's create a Professor variable and initialize it to a DistinguishedProfessor named Bob.
		// Why is this allowed?
		Professor pr1 = new DistinguishedProfessor("Bob", "Geology", 1955, 9, 3);
		
		// Why doesn't this line work?
		Student s1 = new Professor("Carly", "Physics", 1995, 1, 31);
		
		// Why doesn't this line work?
		DistinguishedProfessor dp1 = new Professor("Donald", "Literature", 1976, 6, 12);
		
		// We can get Alice's age. Why?
		System.out.println("Alice is " + p1.getAge() + " years old. \n");
		
		// Huh? Why can't we get Alice's area of specialization?
		System.out.println("Alice's area of specialization is " + p1.getSpecialization());
		
		// Bob is at a yacht club party and wants to brag a bit.
		System.out.prinlnt(pr1.brag());
		// What!?! Why can't Bob Brag?
		
		// Now we are going to call Bob's toString method.
		System.out.println(pr1);
		// Okay, this works. But which version of the display()
		// method was called: Professor's display method or
		// DProfessor display method? Why?
	}

}
