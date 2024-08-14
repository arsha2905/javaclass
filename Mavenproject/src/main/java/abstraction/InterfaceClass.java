package abstraction;

public class InterfaceClass implements InterfaceExample {

	public static void main(String[] args) {
		
		InterfaceClass ic=new InterfaceClass();
		ic.display();
		//InterfaceName in=new ClassName//
		//Object creation of interface
		InterfaceExample ie=new InterfaceClass();
		ie.display();
	}
	//@override
public void display() {
int c= a+b;
System.out.println(c);

	}

}
