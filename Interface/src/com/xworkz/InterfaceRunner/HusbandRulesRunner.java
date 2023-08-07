package com.xworkz.InterfaceRunner;

import com.xworkz.husbandrules.Husband;
import com.xworkz.husbandrules.HusbandRules;


public class HusbandRulesRunner {
	public static void main (String[] args) {
HusbandRules husband = new Husband();
		husband.getThings();
		husband.getSafety();
		System.out.println("rules:"+husband.Maintaining_the_house);
	}

}
