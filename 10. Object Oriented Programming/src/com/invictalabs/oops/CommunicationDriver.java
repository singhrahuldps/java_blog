package com.invictalabs.oops;

public interface CommunicationDriver {
	void connectDevice(String deviceName);
	
	void disconnectDevice();
	
	void sendFile(String filePath);
	
	void receiveFile();
}
