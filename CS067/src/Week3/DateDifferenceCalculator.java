/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Sep 17, 2024
 */
package Week3;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifferenceCalculator {

	public static void main(String[] args) {
		String startDate = "2023-09-17";
		String endDate = "2024-09-17";
		long days = daysBetweenDates(startDate, endDate);
		System.out.println("Days between " + startDate + " and " + endDate + ": " + days + " days");
	}
	// Calculate the number of days between the two dates
	public static long daysBetweenDates(String date1, String date2) {
		// Parsing the input dates in YYYY-MM-DD format
		LocalDate startDate = LocalDate.parse(date1);
		LocalDate endDate = LocalDate.parse(date2);
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		return Math.abs(daysBetween); // Return the absolute value to avoid negative differences
	}	
}
