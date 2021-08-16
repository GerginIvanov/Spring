package net.javaguides.controller;

import net.javaguides.interfaces.IHotDrink;

public class Tea implements IHotDrink {

	@Override
	public String makeDrink() {
		return "Prepairing your tea!";
	}

}
