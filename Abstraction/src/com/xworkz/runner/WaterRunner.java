package com.xworkz.runner;


	import com.xworkz.app.*;

	import com.xworkz.user.*;

	public class WaterRunner {

		public static void main(String[] args) {

			WaterPurify water1 = new Water();

			Aqua aqua = new Aqua(water1);
			aqua.water();

		}

}
