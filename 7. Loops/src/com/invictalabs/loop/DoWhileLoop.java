package com.invictalabs.loop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		// Program to perform summation on two numbers using do-while loop
		int a,b, c;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter first number: ");
			a = scanner.nextInt();
			System.out.println("Enter second number: ");
			b = scanner.nextInt();
			System.out.printf("Sum is %d \n", a + b);
			System.out.println("Press 1 to add more numbers, 0 to exit: ");
			c = scanner.nextInt();
		}while(c == 1);
		scanner.close(); // Always close the scanner

	}

}
