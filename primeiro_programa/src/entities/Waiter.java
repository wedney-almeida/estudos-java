package entities;

public class Waiter {
	
	private String name;
	private Integer registration;
	
	public Waiter() {
	}

	public Waiter(String name, Integer registration) {
		this.name = name;
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRegistration() {
		return registration;
	}
	
	@Override
	public String toString() {
		return name + " (" + registration + ")";
	}
}
