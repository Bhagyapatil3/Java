package com.xworkz.runner;

import com.xworkz.app.Kidney;
import com.xworkz.app.KidneyStone;
import com.xworkz.user.Patient;



public class KidneyRunner {

	public static void main(String[] args) {

		KidneyStone kidney =  new KidneyStone();

		Patient patient = new Patient(kidney);
		patient.patientName();
	}

}
