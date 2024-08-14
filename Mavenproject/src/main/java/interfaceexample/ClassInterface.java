package interfaceexample;

public class ClassInterface implements InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInterface obj=new ClassInterface();
		obj.display();
		obj.print();

}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hai");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("arsha");
	}
}
