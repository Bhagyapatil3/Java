package com.xworkz.InterfaceRunner;

import com.xworkz.bankrules.Bank;
import com.xworkz.bankrules.BankRule;


public class BankRuleRunner {
	public static void main(String[] args) {
		BankRule bank = new Bank();
		bank.getLoan();
		bank.getSafety();
		System.out.println("rules:"+bank.KeepingOrnaments);
	
	
		
	}

}
