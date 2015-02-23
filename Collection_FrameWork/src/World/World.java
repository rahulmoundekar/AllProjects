package World;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class World 
{

	HashMap Country()
	{
	
		ArrayList mh=new ArrayList();
			mh.add("pune");
			mh.add("nashik");
			
			
		ArrayList jh=new ArrayList();
			jh.add("ranchi");
			jh.add("lohardaga");
		
		HashMap india=new HashMap();
		india.put("maharashtra", mh);
		india.put("Jharkhand", jh);
		
		
		ArrayList usa=new ArrayList();
			usa.add("swiz");
			usa.add("sydny");
			
		ArrayList in=new ArrayList();
			in.add("chinu");
			in.add("zin");
			
		HashMap af=new HashMap();
			af.put("USA", usa);
			af.put("england", in);
			
			
		HashMap world=new HashMap();
		world.put("India", india);
		world.put("africa", af);
		
		
		return world;
	}

	
}
