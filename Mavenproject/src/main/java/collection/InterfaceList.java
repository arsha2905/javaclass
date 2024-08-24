package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceList {

	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();//InterfaceName objectName=new ClassName();//interfaceneme:List//ClassName:ArrayList
         li.add(45);
         li.add(560);
         li.add(547);
         System.out.println(li);
         Iterator itr=li.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
        for(int value:li) {
        	System.out.println(value);
	}

}
}