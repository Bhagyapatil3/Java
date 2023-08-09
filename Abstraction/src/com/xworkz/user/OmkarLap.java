package com.xworkz.user;

import com.xworkz.app.Laptop;

public class OmkarLap {

	private Laptop laptop;

	public OmkarLap(Laptop laptop) {
		this.laptop = laptop;
	}

	public void games() {
		if(laptop!=null) {
			System.out.println("it is not null");
			this.laptop.display();
		}
		else {
			System.err.println("it contain null");
		}
	}

}
