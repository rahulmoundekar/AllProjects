package tablecreation;

import java.sql.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import org.hibernate.tool.hbm2ddl.SchemaExport;

public class StudentTest {
	
	public static void main(String[] args)
	{
		
		AnnotationConfiguration configuration=new AnnotationConfiguration();
		configuration.addAnnotatedClass(Student.class);
		
		configuration.configure("hibernate.cfg.xml");
		
	new SchemaExport(configuration).create(true, true);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
				
		Student student=new Student();
			//student.setRolln(1);
			student.setStudentName("rahul");
			student.setStudentAddr("wadgaonsheri");
			student.setStudentmob(987634353);
			student.setPass(true);
			student.setDbo(Date.valueOf("1993-03-15"));
			student.setJoindate(Date.valueOf("2013-06-05"));
			
			
			
			session.save(student);
			session.getTransaction().commit();
		
		
		
	}
}
