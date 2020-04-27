package com.invictalabs.loops;

import java.util.List;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		// Print a pyramid pattern using for loop
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.print("\n");
		}
		System.out.println();
		
		// Print names using enhanced for loop
		List<String> names = List.of("Rahul", "Virat", "Sourav");
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println();
		
		// Program to print first 10 odd numbers using while loop
		int i = 1, count = 0;
		while(count != 10) {
			if(i%2==1) {
				count++;
				System.out.printf("%d ", i);
			}
			i++;
		}
		System.out.print("\n\n");
		
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
