package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Mulit {

	
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add("rahul");
		
		
		HashSet hs=new HashSet();
			hs.add("moundekar");
			
			
			
			HashSet hss=new HashSet();
			
			
			hss.add(al);
			hss.add(hs);
			
			System.out.println(hss);
			
			
			
			
			Iterator itr=hss.iterator();
			while (itr.hasNext()) 
			{
				ArrayList element = (ArrayList) itr.next();
				 Iterator it=element.iterator();
				 while (it.hasNext()) {
					System.out.println(it.next());
					
					
				HashSet h=(HashSet)itr.next();
				Iterator i=h.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
					
				}
					
					
				}
				 
				
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
