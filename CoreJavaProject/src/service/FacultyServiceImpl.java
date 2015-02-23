package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import DAO.CourseDaoImpl;
import DAO.FacultyDaoImpl;

import utility.Utility;

import model.Course;
import model.Faculty;

public class FacultyServiceImpl {
	
	
	ArrayList<Faculty> alfaculty=new ArrayList<Faculty>();
	ArrayList<Course> alcourse=new ArrayList<Course>();
	CourseDaoImpl cd=new CourseDaoImpl();
	FacultyDaoImpl fd= new FacultyDaoImpl();
	CourseServiceImpl csi=new CourseServiceImpl();
	public	void addFaculty()
		{
			

			System.out.println("Enter how many Faculty do you want to Add");
			int id=Utility.scanner.nextInt();
			  for(int i=0;i<id;i++)
			  {
				  Faculty faculty =new Faculty();
				  System.out.println("Enter Faculty id ");
				  faculty.setFid(Utility.scanner.nextInt());
				  
				  System.out.println("Enter Faculty Name");
				  faculty.setFname(Utility.scanner.next());
				  /*if(alcourse.isEmpty())
					csi.addCourse();*/
				  
				  cd.displayCourse();
				  System.out.println("select given Course Id ");  	  
				  int cid=Utility.scanner.nextInt();
				  
				  HashMap<Integer,Course> hm=cd.getCourse();
				  Course c=(Course)  hm.get(cid);
				  
				  faculty.setCourse(c);
				 
				  alfaculty.add(faculty);	  
			  }
			fd.savefaculty(alfaculty);
				
			
		}
	public void displayFaculty()
	{
		fd.displayFaculty();
	}

}
