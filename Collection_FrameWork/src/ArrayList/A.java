package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A {
	
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		
		al.add(1);
		
		al.add(10);
		al.add(1);
		
		System.out.println(al);
		
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
