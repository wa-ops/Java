package main;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Ask the user to enter the number of elements
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        // Create an array to store the numbers
		        int[] numbers = new int[n];

		        // Ask the user to enter the numbers
		        System.out.println("Enter the numbers:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }

		        // Sort the array
		        Arrays.sort(numbers);

		        // Sum the elements using a for loop
		        int sum = 0;
		        for (int i = 0; i < n; i++) {
		            sum += numbers[i];
		        }

		        // Display the sorted array and the sum
		        System.out.println("Sorted array: " + Arrays.toString(numbers));
		        System.out.println("Sum of elements: " + sum);
		    }
		
	}

