package service;

import java.util.ArrayList;
import java.util.HashMap;

import utility.Utility;

import model.Batch;
import model.Course;
import model.Faculty;
import DAO.BatchDaoImpl;
import DAO.CourseDaoImpl;
import DAO.FacultyDaoImpl;

public class BatchServiceImpl
{

	ArrayList<Batch> albatch=new ArrayList<Batch>();
	ArrayList<Faculty> alfaculty=new ArrayList<Faculty>();
	BatchDaoImpl bd=new BatchDaoImpl();	
	FacultyDaoImpl fd= new FacultyDaoImpl();
	FacultyServiceImpl fsi=new FacultyServiceImpl();
	
	public void addBatch() 
	{
		System.out.println("Enter how many Batch do you want to Add");
		int id=Utility.scanner.nextInt();
		  for(int i=0;i<id;i++)
		  {
			  Batch batch=new Batch();
			  System.out.println("Enter Batch id ");
			  batch.setBid(Utility.scanner.nextInt());
			  
			  System.out.println("Enter Batch Name");
			  batch.setBname(Utility.scanner.next());
			    
			  /*if(alfaculty.isEmpty())
				  fsi.addFaculty();*/
			  fd.displayFaculty();
			  System.out.println("select given Faculty Id");
			  int fid=Utility.scanner.nextInt();
			  
			  HashMap<Integer,Faculty> hm=fd.getFaculty();
			  Faculty f=(Faculty)  hm.get(fid);
			  
			  batch.setFaculty(f);
			 
			  albatch.add(batch);	  
		  }
		bd.saveBatch(albatch);
		
	}
	
	public void displayBatch()
	{
		bd.displayBatch();
	}
	
	
	

}
