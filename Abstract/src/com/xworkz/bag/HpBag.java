package com.xworkz.bag;


public class HpBag extends Bag{
	
	@Override
	public void quality() {
		System.out.println("Puma is best brand");
	}
	
	@Override
	public String getBrand() {
		System.out.println("Puma");
		return "Puma";
	}

}
