package net.javaguides.controller;

import net.javaguides.interfaces.IHotDrink;

public class restaurant {

	IHotDrink hotDrink;
	
	restaurant(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	
	public String makeDrink() {
		return this.hotDrink.makeDrink();
	}
}
