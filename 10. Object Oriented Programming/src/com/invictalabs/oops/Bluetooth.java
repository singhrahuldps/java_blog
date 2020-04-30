package com.invictalabs.oops;

public class Bluetooth implements CommunicationDriver{

	String connectedDevice;
	
	@Override
	public void connectDevice(String deviceName) {
		this.connectedDevice = deviceName;
		System.out.println("Connected to " + this.connectedDevice);
	}

	@Override
	public void disconnectDevice() {
		System.out.println("Disconnected " + this.connectedDevice);
		this.connectedDevice = null;
	}

	@Override
	public void sendFile(String filePath) {
		System.out.println("File sent succesfully!");
	}

	@Override
	public void receiveFile() {
		System.out.println("File received succesfully!");
	}

}
