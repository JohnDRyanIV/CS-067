/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 5, 2024
 */
package Week11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 */
public class SerializeDriver {
	
	public static void main(String[] args) throws IOException {
		//create a file Object.dat
		
		try {
		    FileOutputStream outStream = new FileOutputStream("Object.dat");
	
		    //create an ObjectOutputStream to write to the file
		    ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
	
		    //create an object to write to the file (note that MyClass must implement Serializable)
		    Person p = new Person("Carl", 45);
		    Car c = new Car("Z06", "Corovette", 2006, p);
		    
		    objectOutputFile.writeObject(c);
		    
		    //close the files
		    objectOutputFile.close();
		    outStream.close();
		} 
		catch(Exception e) {
			System.out.println("Error");
		}
	}

    
}
