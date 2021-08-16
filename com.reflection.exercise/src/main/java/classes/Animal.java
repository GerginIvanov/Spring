package classes;

public class Animal {
	
	private String type;
	private String name;
	
	public Animal(String string) {
		this.setType(string);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected static String something = "Yes, something!";
}
