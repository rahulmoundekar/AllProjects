package TreeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		
		
		
		
		System.out.println("ArrayList");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(30);
		al.add(20);
		al.add(1);
		
		System.out.println(al);
		
		System.out.println("TreeSet");
		
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>(al);
		
		/*ts.add(30);
		ts.add(40);
		ts.add(0);
		ts.add(0);
		ts.add(50);
		*/
		System.out.println(ts);
		
		Iterator<Integer> itr=ts.iterator();
		while (itr.hasNext()) {
		Integer element = (Integer) itr.next();
		System.out.println(element);
			
		}
		
		
	}

}
