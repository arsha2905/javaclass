package inheritance;

public class HeirarchyA extends HeirarchicalInheritance {
	public void add() {
		System.out.println("Sum");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HeirarchyA obj=new HeirarchyA();
obj.add();
obj.display();
	}

}
