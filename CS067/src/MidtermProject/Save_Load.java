package MidtermProject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Save_Load {
	
	public final String filePath = "ToDoList.json";
	
	
	public void saveToDoList(ToDoList toDo) {
		/**
		 * Gson allows for easy serialization of java objects. Makes saving them
		 * and loading them much easier imo.
		 */
		
		// Create gson object
		Gson gson = new GsonBuilder()
			    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
			    .create();
		
		// Convert ToDoList to json and save to file
		try (FileWriter writer = new FileWriter(filePath)) {
			gson.toJson(toDo, writer);
		} catch (IOException e) {
			System.out.println("Method saveToDoList throws exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ToDoList loadToDoList(ToDoList toDo) {
		
		Gson gson = new GsonBuilder()
			    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
			    .create();
		
		ToDoList rToDo = null;
		
		try {
			Path p = Paths.get(filePath);
			String json = Files.readString(p, StandardCharsets.UTF_8);
			rToDo = gson.fromJson(json, ToDoList.class);
		} catch (IOException e) {
			System.out.println("Method saveToDoList throws exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return rToDo;
		
	}
	
}
