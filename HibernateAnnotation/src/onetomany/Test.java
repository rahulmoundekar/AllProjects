package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Test 
{
	public static void main(String[] args) {
		
	
	AnnotationConfiguration configuration=new AnnotationConfiguration();
	
	configuration.addAnnotatedClass(College.class);
	configuration.addAnnotatedClass(Student.class);
	
	
	configuration.configure("hibernate.cfg.xml");
	
	new SchemaExport(configuration).create(true, true);
	
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
	
	session.beginTransaction();
	
	College college=new College();
	
	college.setCollegeName("Modern College");
	
	
	Student student=new Student();
	student.setStudentName("Rahul Moundekar");
	student.setStudentAddr("kharadi");
	
	Student student2=new Student();
	student2.setStudentName("Sagar sonawane");
	student2.setStudentAddr("kothrud");
	
	
	student.setCollege(college);
	student2.setCollege(college);
	
	session.save(college);
	session.save(student);
	session.save(student2);
	
	
	session.getTransaction().commit();
	
	
	
	
	
	
	}	
	
}
