package com.invictalabs.oops;

// Extends Object Class by default
public class Animal {
	
	public static enum FoodHabits{
		CARNIVORE(0), HERBIVORE(1), OMNIVORE(2);

		private int index;

		public int getIndex() {
			return index;
		}
		
		private FoodHabits(int i) {
			this.index = i;
		}
	}
	
	// State of the object denoted by data members
	String name;
	int age;
	boolean hasTail;
	FoodHabits foodHabit;
	
	// Constructor -> This is the only way to create an animal class
	// We have overridden the default constructor which required no arguments
	public Animal(String name, int age, boolean hasTail, FoodHabits foodHabit) {
		super();
		this.name = name;
		setAge(age);
		this.hasTail = hasTail;
		this.foodHabit = foodHabit;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0) {
			this.age = age;
		}else {
			System.out.println("Invalid age!");
		}
	}
	
	// toString method is present in Object class
	@Override
	public String toString() {
		return "Animal Details ->\nName: " + this.name + "\nAge:  " + this.age + "\nHas Tail: " + this.hasTail + "\nFood Habits: " + this.foodHabit;
	}
	
	public void printDetails() {
		// Whenever we print an object, Java automatically calls its toString Method.
		System.out.println(this);
	}
	
	public void eatFood() {
		System.out.println("Food Eaten!");
	}
}
