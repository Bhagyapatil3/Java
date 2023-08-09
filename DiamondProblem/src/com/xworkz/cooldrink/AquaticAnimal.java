package com.xworkz.cooldrink;

public interface AquaticAnimal extends Animal {
	
	default public void livesIn() {
		System.out.println("lives on water");
	}
}
