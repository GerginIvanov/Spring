package classes;

public class Bird extends Animal {
	private boolean walks;
	
	public Bird() {
		super("bird");
	}
	
	public Bird(String name) {
		super(name);
	}
	
	public Bird(String name, boolean walks) {
		super(name);
		setWalks(walks);
	}
	

	public boolean getWalks() {
		return walks;
	}

	public void setWalks(boolean walks) {
		this.walks = walks;
	}
}
