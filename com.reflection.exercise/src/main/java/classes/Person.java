package classes;

import interfaces.Locomotion;

public class Person extends Animal implements Locomotion {
	public Person(String string) {
		super(string);
	}

	private String name;
	private int age;

	@Override
	public String getLocomotion() {
		// TODO Auto-generated method stub
		return null;
	}
}
