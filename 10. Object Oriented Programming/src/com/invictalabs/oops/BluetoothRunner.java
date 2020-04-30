package com.invictalabs.oops;

public class BluetoothRunner {

	public static void main(String[] args) {
		
		CommunicationDriver cd = new Bluetooth();
		
		cd.connectDevice("OnePlus");
		
		cd.sendFile("Downloads/image.jpg");
		
		cd.receiveFile();
		
		cd.disconnectDevice();

	}

}
