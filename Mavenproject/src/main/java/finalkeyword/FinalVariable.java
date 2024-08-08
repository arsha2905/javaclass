package finalkeyword;

public class FinalVariable extends FinalExample{
	final int a=10;
/*public FinalVariable() {
	int a=20;
}*/
	public final void add() {
		System.out.println("Hai");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalVariable fv=new FinalVariable();
fv.add();
System.out.println(fv.a);
fv.sum();
	}

}
