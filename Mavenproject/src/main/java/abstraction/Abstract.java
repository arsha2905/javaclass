package abstraction;

public class Abstract extends AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract obj=new Abstract();
obj.add();
obj.display();
obj.print();
obj.substract();
	}
	//@override
public void add() {
	System.out.println("Hello world");
}
public void substract() {
	System.out.println("Hello all");
}
}
