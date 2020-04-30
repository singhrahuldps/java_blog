package com.invictalabs.oops;

public class Tiger extends Animal {
	
	// All data members are inherited from Animal class
	// We specify additional data member specific to Tiger
	String tigerSpecies;
	String lastPrey;
	
	public Tiger(int age, String tigerSpecies) {
		// the constructor for the superclass must be defined
		// super() must be the first line in the constructor of base class
		super("Tiger", age, true, Animal.FoodHabits.CARNIVORE);
		this.tigerSpecies = tigerSpecies;
	}
	
	// Method Overloading in Tiger class 
	// eatFood Method can now be called with or without the String argument
	public void eatFood(String preyAnimal) {
		// TODO Auto-generated method stub
		super.eatFood();
		this.lastPrey = preyAnimal;
		System.out.println("Prey: " + lastPrey);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nSpecies: " + this.tigerSpecies + "\nLast Prey: " + this.lastPrey;
	}
	
	// Extra actions for the Tiger class other than 
	// the basic actions for the Animal class
	public void roar() {
		System.out.println("ROARRRR!!!!");
	}
}
