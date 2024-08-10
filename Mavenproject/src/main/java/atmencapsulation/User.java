package atmencapsulation;

public class User {
	
	private String name;
	private int pin;
	
	public User(String name, int pin) {
		this.name=name;
		this.pin=pin;
	}
	
	public int getPin() {
		return pin;
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
	
		User user = new User("Arsha",1001);
		Bank bank = new Bank();
		bank.setPin(user);
		bank.withdrawAmount(500);
		
	}

}
