
package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class PersonTest {
	
	
	public static void main(String[] args) {
		
		
		
		AnnotationConfiguration configuration=new AnnotationConfiguration();
		configuration.addAnnotatedClass(Person.class);
		configuration.addAnnotatedClass(PersonDetails.class);
		
		configuration.configure("hibernate.cfg.xml");
		
		new SchemaExport(configuration).create(true, true);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		
		PersonDetails personDetails=new PersonDetails();
		
		//personDetails.setDetailid(123);
		personDetails.setDetailAddr("kharadi");
		personDetails.setHaveJob("yes");
		
		Person person=new Person();
		
		person.setPersonName("Rahul");
		person.setPersonDetails(personDetails);
		
		
		session.save(person);
		session.getTransaction().commit();
		
		
		
		
		
		
		
	}

}
