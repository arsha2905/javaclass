package polymorphism;

public class Child extends Parent{
	public void sum() {
		int c=a-b;
		System.out.println(c);
		super.sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child obj=new Child();
    obj.sum();
	}

}
