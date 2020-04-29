package com.invictalabs.conditionals;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		// Program to perform mathematical operations on two numbers
		double num1,num2;
		String operation;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = scanner.nextDouble();
		System.out.println("Enter second number");
		num2 = scanner.nextDouble();
		System.out.println("Enter the operation to perform (+,-,*,/)");
		operation = scanner.next();
		
		if(operation.equals("+")) { // This code block runs if the condition is true
			System.out.println(num1 + num2);
		}else if(operation.equals("-")) { // This is only executed if above if fails
			System.out.println(num1 - num2);
		}else if(operation.equals("*")) {
			System.out.println(num1 * num2);
		}else{ // if no above conditions match, this is executed
			System.out.println(num1 / num2);
		}
		
		// Always close the scanner
		scanner.close();

	}

}
