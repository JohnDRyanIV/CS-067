/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Nov 5, 2024
 */
package Week11;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamSerializeDemo {

    public static void main(String[] args) throws IOException {
        //create a file Object.dat
        FileOutputStream outStream = new FileOutputStream("Object.dat");

        //create an ObjectOutputStream to write to the file
        ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);

        //create an object to write to the file (note that MyClass must implement Serializable)
        Task a = new Task("Mike", "Help clean house");
        Task b = new Task("Adam", "Get food from store");
        
        ToDoList toSerialize = new ToDoList();
        toSerialize.add(a);
        toSerialize.add(b);
        
        objectOutputFile.writeObject(toSerialize);

        //close the files
        objectOutputFile.close();
        outStream.close();
    }
}
