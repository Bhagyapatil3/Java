package com.xworkz.InterfaceRunner;


import com.xworkz.hostelrules.Hostel;
import com.xworkz.hostelrules.HostelRule;


public class HostelRulesRunner {
	public static void main (String[] args) {
HostelRule hostel = new Hostel();
		hostel.getEating();
		hostel.getWashing();
		System.out.println("rules:"+hostel.cost);
	}

}
