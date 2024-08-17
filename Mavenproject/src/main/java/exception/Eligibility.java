package exception;

public class Eligibility {
public void votingeligibility() {
	int age=16;
	if (age>=18) {
		System.out.println("The candidate eligible for voting");
	}
	else {
	//	System.out.println("The candidate not eligible for voting");
		throw new ArithmeticException("Not eligible");
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Eligibility obj=new Eligibility();
obj.votingeligibility();
	}
	}