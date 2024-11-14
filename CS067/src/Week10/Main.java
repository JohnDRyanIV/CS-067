/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 29, 2024
 */
package Week10;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class Main extends Application 
{
    private ToDoList myList;
    private VBox checkBoxDisplay;
    private ScrollPane taskDisplayScrollArea;

    public ToDoList getSampleData()
    {
        ToDoList dummyList = new ToDoList();
        Task task1 = new Task("Buy Groceries","get eggs and milk");
        Task task2 = new Task("Finish Assignment 10 in CS 67","I think I have to make a GUI for that");
        Task task3 = new Task("Prepare for Career Fair","send resume in to get critiqued");
        dummyList.addTask(task1);
        dummyList.addTask(task2);
        dummyList.addTask(task3);

        return dummyList;
    }
    
    public void populateTaskList() {
    	checkBoxDisplay.getChildren().clear();
        for(Task t : myList)
        {
            CheckBox cb = new CheckBox(t.getName());
            Label descLabel = new Label(t.toString());
            checkBoxDisplay.getChildren().addAll(cb,descLabel);
            cb.setOnAction(new CheckBoxHandler(t,descLabel));
        }
    }

    @Override
    public void start(Stage stage)
    {
        myList = getSampleData();
        checkBoxDisplay = new VBox(10);
        taskDisplayScrollArea = new ScrollPane();
        
        populateTaskList();

        taskDisplayScrollArea.setContent(checkBoxDisplay);

        VBox taskInput = new VBox();
        
        TextField taskName = new TextField();
        TextArea taskDescription = new TextArea();
        Button addTask = new Button("Add Task");
        
        addTask.setOnAction(new addTaskHandler(taskName, taskDescription));
        
        taskName.setPromptText("Enter task name");
        taskDescription.setPromptText("Enter task description");
        
        taskInput.getChildren().addAll(taskDisplayScrollArea, taskName, taskDescription, addTask);
        
        Scene scene = new Scene(taskInput, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
    private class addTaskHandler implements EventHandler<ActionEvent>
    {
    	TextField taskName;
    	TextArea taskDescription;
    	
    	public addTaskHandler(TextField tn, TextArea td)
    	{
    		taskName = tn;
    		taskDescription = td;
    	}
    	
		@Override
		public void handle(ActionEvent event) {
			if(!taskName.getText().isEmpty() && !taskDescription.getText().isEmpty()) {
				Task toAdd = new Task(taskName.getText(), taskDescription.getText());
				myList.add(toAdd);
				taskName.setText("");
				taskDescription.setText("");
				populateTaskList();	// Repopulates task list
			}
			else {
				System.out.println("You must enter text to add task");
			}
		}
    }

    private class CheckBoxHandler implements EventHandler<ActionEvent>
    {
        private Task currTask;
        private Label descLabel;

        public CheckBoxHandler(Task t, Label d)
        {
            currTask = t;
            descLabel = d;
        }

        @Override
        public void handle(ActionEvent event) 
        {
            CheckBox currCheckBox = (CheckBox) event.getSource();
            if( currCheckBox.isSelected() )
            {
                currTask.markComplete();
            }
            else
            {
                currTask.markIncomplete();
            }
            descLabel.setText(currTask.toString());

        }
        
    }

}
