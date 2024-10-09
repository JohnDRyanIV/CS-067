/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Aug 28, 2024
 * Description: Assignment 2 - Variables
 */

/**
 * 
 */
public class Assignment2 {
	public static void main(String[] args) {
		int hour = 11;
		int minute = 25;
		int second = 49;
		String time_remaining = secondsToMidnight(hour, minute, second);
		
		System.out.println(time_remaining);
	}
	
	/*
	 * This function assumes a 00:00 - 24:00 time format. 
	 * variable names are current time
	 */
	public static String secondsToMidnight(int hour, int minute, int second) {
		int seconds_remaining = 0;
		String message = "";
		
		seconds_remaining += ((24 - (hour + 1)) * 3600);
		seconds_remaining += ((60 - (minute + 1)) * 60);
		seconds_remaining += (60 - second);
		
		message = "At " + String.valueOf(hour) + ":" + String.valueOf(minute) + ":" + String.valueOf(second)
		+ " there remains " + String.valueOf(seconds_remaining) + " seconds until midnight";
		
		return message;
		
	}

}
