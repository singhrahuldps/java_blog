package com.invictalabs.loop;

public class ForLoop {

	public static void main(String[] args) {
		
		// Print a pyramid pattern using for loop
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.print("\n");
		}

	}

}
