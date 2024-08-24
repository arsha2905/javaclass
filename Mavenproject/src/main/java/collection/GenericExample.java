package collection;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		
ArrayList<Integer>a1=new ArrayList<Integer>();
a1.add(32);
a1.add(56);
a1.add(45);
a1.add(101);
System.out.println(a1);
a1.remove(0);//remove element from the list
System.out.println(a1);
int length=a1.size();//find the length
System.out.println(length);
boolean b=a1.contains(45);
System.out.println(b);
System.out.println(a1.get(2));//get value
a1.removeAll(a1);//remove all elements from the list
System.out.println(a1);
	}

}
