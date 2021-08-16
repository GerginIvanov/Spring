package net.javaguides.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.interfaces.ShoeInterface;

@Service
public class Factory {
	
	ShoeInterface shoeInterface;

	@Autowired
	public Factory(ShoeInterface shoeInterface) {
		this.shoeInterface = shoeInterface;
	}
	
	public String makeShoes() {
		return this.shoeInterface.makeShoes();
	}
	
	
}
