package com.invictalabs.oops;

public interface CommunicationDriver {
	void connectDevice(String deviceName);
	
	default void disconnectDevice() {
		System.out.println("Device disconnected");
	}
	
	void sendFile(String filePath);
	
	void receiveFile();
}
