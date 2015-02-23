package service;

import java.util.ArrayList;
import java.util.HashMap;

import utility.Utility;

import model.Batch;
import model.Course;
import model.Faculty;
import model.Student;
import DAO.BatchDaoImpl;
import DAO.CourseDaoImpl;
import DAO.FacultyDaoImpl;
import DAO.StudentDaoImpl;

public class StudentServiceImpl
{
	ArrayList<Student> alstudent=new ArrayList<Student>();
	ArrayList<Batch> albatch=new ArrayList<Batch>();
	StudentDaoImpl sd=new StudentDaoImpl();
	BatchDaoImpl bd=new BatchDaoImpl();
	FacultyDaoImpl fd=new FacultyDaoImpl();
	CourseDaoImpl cd=new CourseDaoImpl();
	CourseServiceImpl csi=new CourseServiceImpl();
	public void addStudent()
	{
		System.out.println("Enter how many Student do you want to Add");
		int id=Utility.scanner.nextInt();
		  for(int i=0;i<id;i++)
		  {
			  Student student=new Student();
			  System.out.println("Enter Student id ");
			  student.setRollno(Utility.scanner.nextInt());
			  
			  System.out.println("Enter Student Name");
			  student.setName(Utility.scanner.next());
			    
			 /* if(albatch.isEmpty())
				  csi.addCourse();*/
				  
			  bd.displayBatch();
			  System.out.println("select given Batch Id");
			  int bid=Utility.scanner.nextInt();
			  
			 /* fd.displayFaculty();
			  System.out.println("slect given course Id");
			  int cid=Utility.scanner.nextInt();*/
			  
			  HashMap<Integer,Batch> hm=bd.getBatch();
			  Batch batch=hm.get(bid);
			  student.setBatch(batch);
			 
			  alstudent.add(student);	  
		  }
		sd.saveStudent(alstudent);
		
	}
public void displayStudent()
{
	sd.displayStudent();
}/*
public void searchsStudent() {
	sd.searchStudentRollno();
	
}*/
	
	
	
	
}
