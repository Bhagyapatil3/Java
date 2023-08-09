package com.xworkz.app;

public class Water implements WaterPurify{

	@Override
	public boolean filter() {
		System.out.println("filter in Water");
		return true;
	}

}
