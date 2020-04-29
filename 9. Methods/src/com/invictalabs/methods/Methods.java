package com.invictalabs.methods;

import java.util.ArrayList;
import java.util.List;

public class Methods {
	
	// Program to return average of numbers
	public static double doAverage(ArrayList<Integer> marks) {
		// double for more precision than Integer during division
		double avg = 0.0;
		
		for(int mark: marks) {
			avg += mark;
		}
		// size() method returns the number of elements in array
		avg = avg/marks.size();
		
		return avg;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>(List.of(95,96,98));
		
		// static methods can be accessed directly without creating a class object
		// Here class name is Methods
		double avg = Methods.doAverage(marks);
		
		System.out.println(avg);

	}

}
