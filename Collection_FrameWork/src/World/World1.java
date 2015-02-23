package World;

import java.util.ArrayList;
import java.util.HashMap;

public class World1 
{

	HashMap Country()
	{
	
		ArrayList<String> mh=new ArrayList<String>();
			mh.add("pune");
			mh.add("nashik");
			
			
		ArrayList<String> jh=new ArrayList<String>();
			jh.add("ranchi");
			jh.add("lohardaga");
		
		HashMap<String, ArrayList<String>> india=new HashMap<String, ArrayList<String>>();
		india.put("maharashtra", mh);
		india.put("Jharkhand", jh);
		
		
		ArrayList<String> usa=new ArrayList<String>();
			usa.add("swiz");
			usa.add("sydny");
			
		ArrayList<String> in=new ArrayList<String>();
			in.add("chinu");
			in.add("zin");
			
		HashMap<String, ArrayList<String>> af=new HashMap<String, ArrayList<String>>();
			af.put("USA", usa);
			af.put("england", in);
			
			
		HashMap<String, HashMap<String, ArrayList<String>>> world=new HashMap<String, HashMap<String,ArrayList<String>>>();
		world.put("India", india);
		world.put("africa", af);
		
		
		return world;
	}

	
}
