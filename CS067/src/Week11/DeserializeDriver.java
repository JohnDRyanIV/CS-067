/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 5, 2024
 */
package Week11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 
 */
public class DeserializeDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 //OPEN a file Object.dat
        
        try {
            FileInputStream inStream = new FileInputStream("Object.dat");
            ObjectInputStream objectInputFile = new ObjectInputStream(inStream);
            //create an ObjectInputStream to read in data from the file

            // read in the data into a MyClass object
            Car anObject = (Car) objectInputFile.readObject();

            // print it out!
            System.out.println(anObject.toString());

            //close the files
            objectInputFile.close();
            inStream.close();
        }
        catch(Exception e) {
        	System.out.println("Error.");
        }


    }
}
