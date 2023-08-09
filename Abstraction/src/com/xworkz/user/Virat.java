package com.xworkz.user;

import com.xworkz.app.*;

public class Virat {

	private SmartWatch smart;

	public Virat(SmartWatch smart){
		this.smart= smart;
	}

	public void hours() {
		if(smart!=null) {
			System.out.println("hours in Kohli");
			this.smart.showTime();
		}
		else {
			System.err.println("its null");
		}
	}

}
