package com.invictalabs.loop;

import java.util.List;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		// Print names using enhanced for loop
		List<String> names = List.of("Rahul", "Virat", "Sourav");
		for(String name:names) {
			System.out.println(name);
		}

	}

}
