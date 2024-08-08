package aggregation;

public class Address {
Student st;
String address;
public Address(Student st,String address) {
	this.st=st;
	this.address=address;
}
public void display() {
	System.out.println("Student name: "+ st.name);
	System.out.println("Roll number: "+st.rollNo);
	System.out.println("Address: "+address);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student("Arsha Raj",4);
		Address adr=new Address(stu,"Ajesh Bhavan");
		adr.display();
	}

}
