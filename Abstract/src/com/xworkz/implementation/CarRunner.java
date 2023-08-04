package com.xworkz.implementation;

import com.xworkz.abstractP.WirelessConnections;

public class CarRunner {
	
	public static void main(String [] args) {
		
		WirelessConnections wirelessConnections = new WirelessConnections();
		wirelessConnections.budget();
		wirelessConnections.getExpectedTime();
		
	}

}
