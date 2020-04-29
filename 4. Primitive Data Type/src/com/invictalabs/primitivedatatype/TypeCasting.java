package com.invictalabs.primitivedatatype;

public class TypeCasting {

	public static void main(String[] args) {
		
		// Program to perform Type Casting in Java
		int num = 1000;
		
		// Leads to loss of information
		byte narrowCasting = (byte) num;
		
		// No loss of information
		double wideCasting = (double) num;
		
		System.out.println("Original integer      : " + num); // Prints 1000
		System.out.println("Narrow casted to byte : " + narrowCasting); // Prints -24 
		System.out.println("Wide casted to double : " + wideCasting); // Prints 1000.0
		
		
	}

}
