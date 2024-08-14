package abstraction;

public class C1 implements Example1,Example2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj=new C1();
		obj.display();
		obj.fullname();	
		
	//InterfaceName in=new InterfaceClass();
	    Example1 ex=new C1();
		ex.display();
		
		Example2 ex2=new C1();
		ex2.fullname();
		
	}
public void display() {
int sum=x+y;
System.out.println(sum);

}
public void fullname() {
System.out.println(firstname+"  "+surname);
}
}