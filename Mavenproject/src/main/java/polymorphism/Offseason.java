package polymorphism;

public class Offseason extends Onseason{
	int discount1;
	public void discount(int rate) {
		discount1=rate*15/100;
		System.out.println("Offseason discount rate : "+discount1);
		super.discount(rate);
		
	}
	public static void main(String[] args) {
		Offseason ofs=new Offseason();
		ofs.discount(150);
		
	}

}
