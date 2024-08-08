package polymorphism;

public class Division extends Addition1{
public int add() {
	super.add();
	if (sum%10==0) {
		System.out.println("Sum is fully divisible by 10");
	}
	else {
		System.out.println("Sum is NOT fully divisible by 10");
	}
	
return sum;	
}
	public static void main(String[] args) {
	
Division obj=new Division();
obj.add();
	}
}






















