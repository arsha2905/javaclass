package atmencapsulation;

public class Bank {
	
	private int[] validPins= {1001,1234,1212};
	private int userPin;
	
public void setPin(User user) {
	this.userPin=user.getPin();	
}


	public boolean validatePin() {
		for (int i=0;i<validPins.length;i++){
			if(validPins[i]==this.userPin) {
			return true;		
		}
	}
	return false;
}
	
public void withdrawAmount(double amount) {
	if(validatePin()) {
		System.out.println("Withdrawal of Rs "+amount+" is successful");
	}else {
		System.out.println("invalid pin,You can't withdraw amount");
	}
	}
}
