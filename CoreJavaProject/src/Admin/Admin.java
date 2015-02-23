package Admin;

import java.util.Scanner;

import service.BatchServiceImpl;
import service.CourseServiceImpl;
import service.FacultyServiceImpl;
import service.StudentServiceImpl;

public class Admin {
	
	Scanner sc=new Scanner(System.in);
	//Allinformation alinfo=new Allinformation();
	CourseServiceImpl courseImpl=new CourseServiceImpl();
	FacultyServiceImpl facultyImpl=new FacultyServiceImpl();
	BatchServiceImpl batchImpl=new BatchServiceImpl();
	StudentServiceImpl studentImpl=new StudentServiceImpl();
	void showMenu()
	{
		while(true)
		{System.out.println("\t---MENU--");
			System.out.println("\t1 Add Course");
			System.out.println("\t2 Add Faculty");
			System.out.println("\t3 Add Batch");
			System.out.println("\t4 Add Student");
			System.out.println("\t5 Display Course");
			System.out.println("\t6 Display Faculty");
			System.out.println("\t7 Display Batch");
			System.out.println("\t8 Display Student");
			System.out.println("\t9 Search student");
			System.out.println("\t10 Exit");
			System.out.println("Enter your choice::");
			int ch=0;
			try{
			 ch = sc.nextInt();
			}catch (Exception e) {
				ch = sc.nextInt();
				
			}
			switch(ch)
			{
			case 1:courseImpl.addCourse();break;
			case 2:facultyImpl.addFaculty();break;
			case 3:batchImpl.addBatch();break;
			case 4:studentImpl.addStudent();break;
			case 5:courseImpl.displayCourse(); break;
			case 6:facultyImpl.displayFaculty();break;
			case 7:batchImpl.displayBatch();break;
			case 8:studentImpl.displayStudent();break;
			//case 9:studentImpl.searchsStudent();break;
			case 9:System.exit(0);
			}
			if(ch==9)
				break;
			
		}
		
	}
	
	
	
public static void main(String[] args) {
Admin admin=new Admin();
admin.showMenu();
}

}
