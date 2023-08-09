package com.xworkz.runner;

import com.xworkz.user.Virat;

import com.xworkz.app.*;

public class SmartRunner {

	public static void main(String[] args) {


		SmartWatch smart = new Time();

		Virat ko = new Virat(smart);
		ko.hours();

	}

}
