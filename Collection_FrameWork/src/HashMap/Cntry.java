package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import ArrayList.Arrray;

public class Cntry {
	
	
	
	public static void main(String[] args) {
		
		State state=new State();
		
		HashMap hm=state.allState();
		
		Set s=hm.keySet();
		System.out.println(s);

		Iterator itr=s.iterator();
		while (itr.hasNext()) 
		{
			String sname = (String) itr.next();
			System.out.println(sname);
			
			ArrayList a=(ArrayList)hm.get(sname);
			
			Iterator itr1=a.iterator();
			
			while (itr1.hasNext()) 
			{
				City c=(City) itr1.next();
				System.out.println(c.name);
				
				
			}
			
		}
		
		
		
		
	}

}
