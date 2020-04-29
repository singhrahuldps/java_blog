package com.invictalabs.strings;

public class StringClass {

	public static void main(String[] args) {
		
		// Strings can be null
		String string = null;
		System.out.println(string);
		
		// Strings are immutable i.e. their value once set cannot be changed;
		string = "This is a string.";
		System.out.println(string);
		
		// String class also has some helpful functions
		System.out.println(string.toUpperCase());

	}

}
