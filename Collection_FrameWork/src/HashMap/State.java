package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class State {
	
	
	HashMap allState()
	{
		City c=new City();
		City c1=new City();
		City c2=new City();
		City c3=new City();
		
		
		
		c.setName("pune");
		c1.setName("nashik");
		
		c2.setName("ranchi");
		c3.setName("lohadarga");
		
		
		
		ArrayList mh=new ArrayList();
		mh.add(c);
		mh.add(c1);
		
		ArrayList jh=new ArrayList();
		jh.add(c2);
		jh.add(c3);
		
		
		HashMap india=new HashMap();
		india.put("maharashtra", mh);
		india.put("jharkhand", jh);
		
		
		
		return india;
		
		
		
		
		
		
		
		
		
		
	}

}
