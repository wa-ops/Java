package main;
import java.util.Scanner;
public class AverageMarks {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Array to store the marks of five units
	        double[] marks = new double[5];
	        double sum = 0;

	        // Ask the student to enter the marks for each unit
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter the marks for unit " + (i + 1) + ": ");
	            marks[i] = scanner.nextDouble();
	            sum += marks[i];
	        }

	        // Compute the average
	        double average = sum / 5;

	        // Display the average with two decimal places
	        System.out.printf("The average marks are: %.2f%n", average);
	    }
	}
	

