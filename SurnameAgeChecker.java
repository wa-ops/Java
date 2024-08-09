package main;
import java.util.Scanner;

public class SurnameAgeChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask for the user's surname
	        System.out.print("Enter your surname: ");
	        String surname = scanner.nextLine();

	        // Ask for the user's age
	        System.out.print("Enter your current age: ");
	        int age = scanner.nextInt();

	        // Calculate the number of characters in the surname
	        int surnameLength = surname.length();

	        // Determine if the age is even or odd
	        String ageType = (age % 2 == 0) ? "even" : "odd";

	        // Print the results
	        System.out.println("The number of characters in your surname is " + surnameLength + ".");
	        System.out.println("Your current age is an " + ageType + " number.");
	    }
	

}
