package com.xworkz.runner;

import com.xworkz.user.OmkarLap;

import com.xworkz.app.*;

public class LaptopRunner {

	public static void main(String[] args) {

		Laptop lap = new DellLaptop();

		OmkarLap om = new OmkarLap(lap);

		om.games();

	}

}
