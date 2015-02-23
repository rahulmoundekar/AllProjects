package University;

import java.util.ArrayList;

public class College {
	
	
	ArrayList Formfill()
	{
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();

		s.setName("rahul");
		s.setRollno(121);
	
		ArrayList a=new ArrayList();
		a.add(s);
		
		s1.setName("yogi");
		s1.setRollno(545);
				
		ArrayList a1=new ArrayList();
		a1.add(s1);

		s2.setName("swapnil");
		s2.setRollno(980);
		
		ArrayList a2=new ArrayList();
		a2.add(s2);
		
		
		
		ArrayList al=new ArrayList();
		al.add(a);
		al.add(a1);
		al.add(a2);
		
		
		return al;
		
		
		
		
		
		
		
		
		
		
	}


}
