package com.invictalabs.primitivedatatype;

public class TypeCasting {

	public static void main(String[] args) {
		
		// Program to perform Type Casting in Java
		int num = 1000;
		
		// Leads to loss of information
		byte narrowcasting = (byte) num;
		
		// No loss of information
		double widecasting = (double) num;
		
		System.out.println("Original integer      : " + num); // Prints 1000
		System.out.println("Narrow casted to byte : " + narrowcasting); // Prints -24 
		System.out.println("Wide casted to double : " + widecasting); // Prints 1000.0
		
		
	}

}
