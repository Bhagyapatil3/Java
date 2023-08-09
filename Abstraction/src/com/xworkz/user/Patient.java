package com.xworkz.user;

import com.xworkz.app.Kidney;
import com.xworkz.app.KidneyStone;

public class Patient1{

		private Kidney kidney;

		public Patient1(Kidney kidney){
			this.kidney = kidney;
		}

		public Patient1(KidneyStone kidney2) {
			// TODO Auto-generated constructor stub
		}

		public void Patient(KidneyStone kidney2) {
			// TODO Auto-generated constructor stub
		}

		public void patientName() {
			if(kidney!=null) {
				System.out.println("kidney invoking in Patient");
				this.kidney.clean();
			}
			else {
				System.err.println("kidney invoking a null value");
			}
		}

}
