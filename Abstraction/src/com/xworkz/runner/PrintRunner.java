package com.xworkz.runner;


import com.xworkz.user.PuttuPrint;
import com.xworkz.user.PuttuPrint1;
import com.xworkz.app.*;

public class PrintRunner {

	public static void main(String[] args) {

		PrintSheet print = new PrintSheet();

		PuttuPrint1 puttu = new PuttuPrint1(print);
		puttu.current();




	}

}
