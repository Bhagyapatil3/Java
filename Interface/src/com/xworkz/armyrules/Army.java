package com.xworkz.armyrules;


public class Army implements ArmyRule {

	@Override
	public void getDiscipline() {
		System.out.println("invoking the discipline");
		
	}

	@Override
	public void getUniforms() {
		System.out.println("invoking the uniforms");
		
	}
	
}
