package com.invictalabs.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		
		// Program to add and edit names in a list
		// ArrayList implements the List interface and are mutable 
		ArrayList<String> names = new ArrayList<>(List.of("Rahul", "Virat", "Sourav"));
		
		// Elements can be added or removed from an ArrayList
		names.add("Rohit");
		
		// This prints the elements of the list
		System.out.println(names); // [Rahul, Virat, Sourav, Rohit]
		
		// To iteratively delete elements from a list,
		// we must use the iterator class instead of looping over the array
		Iterator<String> itr = names.iterator(); // gets the iterator for names list
		String s;
		while(itr.hasNext()) { // while there is a next element
			s = itr.next();
			if(s.endsWith("at")) {
				itr.remove();
			}
		}
		
		System.out.println(names); // [Rahul, Sourav, Rohit]
	}

}
