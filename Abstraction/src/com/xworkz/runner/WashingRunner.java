package com.xworkz.runner;

import com.xworkz.app.SamsungWashingMachine;
import com.xworkz.app.WashingMachine;
import com.xworkz.user.KapilWash;

public class WashingRunner {

	public static void main(String[] args) {

		WashingMachine washingmachine = new SamsungWashingMachine();

		KapilWash wash = new KapilWash(washingmachine);
		wash.machine();

	}

}
