package main;

import java.util.Scanner;

	public class Calculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter the first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        // Ask the user to enter an operation
	        System.out.print("Enter an operation : ");
	        char operation = scanner.next().charAt(0);

	        // Ask the user to enter the second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Variable to store the result
	        double result = 0;

	        // Perform the operation based on user input
	        switch (operation) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation.");
	                return;
	        }

	        // Display the result
	        System.out.println("The result is: " + result);
	    }
	}

