package com.xworkz.companyrules;

import com.xworkz.companyrules.CompanyRules;

public class Company implements CompanyRules {
	
	@Override
	public void getId() {
		System.out.println("invoking the Id");
		
	}

	@Override
	public void getLaptop() {
		System.out.println("invoking the Laptop");
		
	}

}
