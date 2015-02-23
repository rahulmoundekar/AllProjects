package World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GentricDisplay {
	public static void main(String[] args) {
	
		World1 w=new World1();
				HashMap<String, HashMap<String, ArrayList<String>>> world=w.Country();
				
				Set<String> s=world.keySet();
				System.out.println(s);
				System.out.println("==========");
				Iterator<String> i=s.iterator();
				
				while (i.hasNext()) 
				{
					String sname =i.next();
					System.out.println(sname);
					
					HashMap<String, ArrayList<String>> state=world.get(sname);
						Set<String> s1=state.keySet();
						System.out.println(s1);
						Iterator<String> it=s1.iterator();
						while (it.hasNext()) 
						{
							String cname = it.next();
							System.out.println("==========");
							System.out.println(cname);
							
							ArrayList<String>	al=state.get(cname);
							Iterator<String> itr=al.iterator();
							while (itr.hasNext()) 
							{
								String element =itr.next();
								System.out.println(element);
								
							}
						
						
						}
						System.out.println("==========");
					
				}
				
				
		
	}
}
