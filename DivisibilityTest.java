package main;
import java.util.Scanner;
public class DivisibilityTest {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask for the user's number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check divisibility for each number from 1 to 9
	        for (int i = 1; i <= 9; i++) {
	            if (number % i == 0) {
	                System.out.println("The number " + number + " is divisible by " + i + " because it ends with " + (number % 10) + ".");
	            }
	        }

	        // Special case for 0
	        if (number == 0) {
	            System.out.println("The number is 0, which is divisible by any number.");
	        }
	    }
	}


