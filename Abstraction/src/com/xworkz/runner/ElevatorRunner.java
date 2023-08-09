package com.xworkz.runner;

import com.xworkz.app.Elevator;
import com.xworkz.app.ElevatorImplents;
import com.xworkz.user.Anusha;

public class ElevatorRunner {

	public static void main(String[] args) {

		Elevator elevator = new ElevatorImplents();

		Anusha anusha = new Anusha(elevator);

		anusha.lifting();

	}

}
