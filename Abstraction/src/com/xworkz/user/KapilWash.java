package com.xworkz.user;

import com.xworkz.app.WashingMachine;

public class KapilWash {

	private WashingMachine wash;

	public KapilWash(WashingMachine washingmachine) {
		
	}

	public void KapilWash1(WashingMachine wash) {
		this.wash = wash;
	}

	public void machine() {
		if(wash!=null) {
			System.out.println("machine in KapilWash");
			this.wash.dry();
		}
		else {
			System.err.println("its contain null values");
		}
	}

	}


