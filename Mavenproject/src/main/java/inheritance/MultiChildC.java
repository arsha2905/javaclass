package inheritance;

public class MultiChildC extends MultiChildB{
public void substract() {
	System.out.println("C");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiChildC obj=new MultiChildC();
obj.substract();
obj.add();
obj.display();
	}

}
