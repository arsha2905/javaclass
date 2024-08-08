package superkeyword;

public class Division extends Addition1 {
	
	public void division() {
	 int sum1 =	super.add();
		
		if (sum1%10==0) {
			System.out.println("Sum is fully divisible by 10");
		}
		else {
			System.out.println("Sum is NOT fully divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		
		Division obj = new Division();
		obj.division();
	}

}
