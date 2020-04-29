package com.invictalabs.strings;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer integer = null;
		System.out.println(integer);
		
		// Integer objects are immutable and should be 
		// initialized using the valueOf method
		integer = Integer.valueOf(10);
		System.out.println(integer);
		
		System.out.println(integer.equals(11));

	}

}
