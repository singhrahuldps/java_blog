package com.invictalabs.loop;

public class WhileLoop {

	public static void main(String[] args) {
		
		// Program to print first 10 odd numbers using while loop
		int i = 1, count = 0;
		while(count != 10) {
			if(i%2==1) {
				count++;
				System.out.printf("%d ", i);
			}
			i++;
		}

	}

}
