package com.xworkz.cooldrink;

public class Frog implements Animal, AquaticAnimal ,TerrestrialAnimal{
	
	@Override
		public void livesIn() {
		AquaticAnimal.super.livesIn();
		TerrestrialAnimal.super.livesIn();
	}

}
