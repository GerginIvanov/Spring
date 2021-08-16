package net.javaguides.controller;

import org.springframework.stereotype.Service;

import net.javaguides.interfaces.ShoeInterface;

@Service
public class Shoe implements ShoeInterface {
	
	public String makeShoes() {
		return "Making shoes!";
	}
}
