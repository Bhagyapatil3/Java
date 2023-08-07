package com.xworkz.InterfaceRunner;

import com.xworkz.armyrules.Army;
import com.xworkz.armyrules.ArmyRule;


public class ArmyRuleRunner {
	public static void main(String[] args) {
		ArmyRule army = new Army();
		army.getDiscipline();
		army.getUniforms();
		System.out.println("rules:"+army.everyone_should_talk);
	
	
		
	}

}
