package com.invictalabs.list;

public class Lists {

	public static void main(String[] args) {
		
		int [] ages = new int[5];
		for(int i=0;i<5;i++) {
			ages[i] = 20 + i;
		}
		
		for(int age:ages) { // 20 21 22 23 24 
			System.out.printf(age + " ");
		}
		System.out.println(); // new line
		
		// This creates a list of 5 elements
		int[] marks = {95,95,95,95,96};
		
		// We can modify the list elements but not add/remove elements
		marks[2] = 98;
		
		for(int mark:marks) { // 95 95 98 95 96 
			System.out.printf(mark + " ");
		}
		
	}

}
