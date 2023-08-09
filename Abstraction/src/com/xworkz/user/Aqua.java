package com.xworkz.user;

import com.xworkz.app.WaterPurify;

public class Aqua {

 private WaterPurify waterpurify;


	public Aqua(WaterPurify waterpurify) {
		this.waterpurify = waterpurify;
	}

	public void water() {
		if(waterpurify!=null) {
			System.out.println("not null values");
			this.waterpurify.filter();
		}
		else {
			System.err.println();
		}
	}

}
