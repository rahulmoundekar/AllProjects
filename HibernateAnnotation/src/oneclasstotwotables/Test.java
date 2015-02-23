package oneclasstotwotables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Test 
{
	public static void main(String[] args)
	{
	
		AnnotationConfiguration configuration=new AnnotationConfiguration();
		configuration.addAnnotatedClass(College.class);
		
		configuration.configure("hibernate.cfg.xml");
		
		new SchemaExport(configuration).create(true, true);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		
		College college=new College();
		
		
		
		college.setCollegeId(1);
		college.setCollegeName("moderncollege");
		college.setCollegeAddr("ganeshkhind");
		college.setCollegeCode(227);
		college.setCollegeUniversity("puneuniversity");
		
		
		session.save(college);
		
		session.getTransaction().commit();
		
		
		
		
	}
}
