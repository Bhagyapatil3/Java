package com.xworkz.user;

import com.xworkz.app.Elevator;

public class Anusha {

	private Elevator elevator;

	public Anusha(Elevator elevator){
		this.elevator = elevator;
	}

	public void lifting() {
		if(elevator!=null) {
			System.out.println("it is not null");
			this.elevator.carryLaguage();
		}
		else {
			System.out.println("is null");
		}
	}


}
