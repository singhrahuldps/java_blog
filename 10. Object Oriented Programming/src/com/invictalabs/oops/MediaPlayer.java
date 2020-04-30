package com.invictalabs.oops;

// A Media Player IS A Device
public class MediaPlayer extends Device{

	boolean turnedOn;
	
	// In absence of super() statement, java automatically adds one during compilation
	public MediaPlayer() {
		this.turnedOn = false;
	}

	@Override
	void switchOn() {
		System.out.println("Player turned On!");
		this.turnedOn = true;
	}

	@Override
	void switchOff() {
		System.out.println("Player turned Off!");
		this.turnedOn = false;
	}

}
