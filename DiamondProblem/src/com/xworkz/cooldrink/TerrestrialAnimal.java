package com.xworkz.cooldrink;

public interface TerrestrialAnimal extends Animal {
	
	default public void livesIn() {
		System.out.println("lives on land");
}
}
