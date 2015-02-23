package University;

import java.util.ArrayList;
import java.util.Iterator;

public class University 
{
	public static void main(String[] args) 
	{
		
	
	
	
	College c=new College();
	ArrayList al=c.Formfill();
	
	Iterator itr=al.iterator();
	
		while (itr.hasNext())
		{
				ArrayList all=(ArrayList) itr.next();
					Iterator itr1=all.iterator();
	
						while (itr1.hasNext()) 
						{
							Student element = (Student) itr1.next();
							System.err.println(element.rollno);
							System.out.println(element.name);
							
						}
		
		
		
		
		}
	}
}

	
	
	
	
	
	
	
	