package com.invictalabs.conditionals;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		int input;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the code for the day of the week (1-7)");
		input = scanner.nextInt();
		
		switch(input) {
		case 1: System.out.println("Monday");
			break;
		case 2: System.out.println("Tuesday");
			break;
		case 3: System.out.println("Wednesday");
			break;
		case 4: System.out.println("Thursday");
			break;
		case 5: System.out.println("Friday");
			break;
		case 6: System.out.println("Saturday");
			break;
		case 7: System.out.println("Sunday");
			break;
		default: System.out.println("Invalid Input");
		}
		
		scanner.close();
	}

}
