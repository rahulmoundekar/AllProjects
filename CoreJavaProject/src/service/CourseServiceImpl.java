package service;

import java.util.ArrayList;

import DAO.CourseDaoImpl;

import utility.Utility;
import model.Course;

public class CourseServiceImpl {
	
	
	ArrayList<Course> alcourse=new ArrayList<Course>();
	CourseDaoImpl cd=new CourseDaoImpl();
	
	public	void addCourse()
		{
		
		
		System.out.println("Enter how many Course do you want to Add");
		int id=Utility.scanner.nextInt();
		  for(int i=0;i<id;i++)
		  {
			  Course course=new Course();
			  System.out.println("Enter course id ");
			  course.setCid(Utility.scanner.nextInt());
			  
			  System.out.println("Enter Course Name");
			  course.setCname(Utility.scanner.next());
			  
			 
			  alcourse.add(course);
			  
		  }
		  cd.saveCourse(alcourse);
		
		
			
		}
	
	
public	void displayCourse()
	{
		cd.displayCourse();
	}

}
