package exception;

public class ExceptionTryCatch {
public void division() {
	try {
	int a=10/0;
	System.out.println(a);
	}
	catch(Exception e) {
		System.out.println("exception handling" +e);
	}
	finally {
		System.out.println("Java Program");
	}
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExceptionTryCatch ex=new ExceptionTryCatch();
ex.division();
	}

}
