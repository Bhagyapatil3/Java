package com.xworkz.cooldrink;

public interface CokeCoolDrink extends CoolDrink {
	
default public void cool() {
	System.out.println("invoking the cool");
}

}
