package com.xworkz.hostelrules;

public class Hostel implements HostelRule {

	@Override
	public void getEating() {
		System.out.println("invoking the eating");
		
	}

	@Override
	public void getWashing() {
		System.out.println("invoking the washing");
		
	}

}
