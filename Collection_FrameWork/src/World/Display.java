package World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Display {

	public static void main(String[] args) {
		
	
		
		World w=new World();
		HashMap world=w.Country();

		Set s=world.keySet();
		System.out.println(s);
		
		Iterator i=s.iterator();
		while (i.hasNext())
		{
			String sname=(String)i.next();
			System.out.println("----------------------------------------------");
			System.out.println("\t"+sname);
			//System.out.println("----------------------------------------------");
			HashMap hm1=(HashMap)world.get(sname);
			
			Set s1=hm1.keySet();
			System.out.println(s1);
			
			Iterator it=s1.iterator();
			while (it.hasNext())
			{
				String city=(String) it.next();
				System.out.println("----------------------------------------------");
				System.out.println(city);
				//System.out.println("----------------------------------------------");
				ArrayList al=(ArrayList)hm1.get(city);
				Iterator itr=al.iterator();
				while(itr.hasNext())
				{
					System.out.println("\t"+itr.next());
				}
				
			}	
			//System.out.println("----------------------------------------------");
			System.out.println("\n");
		}
		
	}
}
