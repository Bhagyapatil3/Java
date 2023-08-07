package com.xworkz.InterfaceRunner;

import com.xworkz.vturules.Vtu;
import com.xworkz.vturules.VtuRules;


public class VtuRulesRunner {
	public static void main (String[] args) {
VtuRules vtu = new Vtu();
		vtu.getUsn();
		vtu.getPlacement();
		System.out.println("rules:"+vtu.Vtu_allow_through_cet);
	}
}
