package com.invictalabs.oops;

public class MediaPlayerRunner {

	public static void main(String[] args) {
		
		// We can't create an object of Device class
		// Device device = new Device(); is not allowed
		Device mp = new MediaPlayer();
		
		mp.switchOn();
		
		mp.switchOff();

	}

}
