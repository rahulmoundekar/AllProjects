package twoclasstoonetable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CustmerTest 
{
public static void main(String[] args)
{
	AnnotationConfiguration configuration=new AnnotationConfiguration();
	configuration.addAnnotatedClass(Customer.class);
	
	configuration.configure("hibernate.cfg.xml");
	
	new SchemaExport(configuration).create(true, true);
	
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
	
	session.beginTransaction();
	
	
	Customer customer=new Customer();
	
		customer.setCustName("Rahul Moundekar");
		
		
	CustomerInfo customerInfo=new CustomerInfo();
	
	customerInfo.setCustAddr("kharadi");
	customerInfo.setSalary(20000);
	customerInfo.setPermanant(true);
	
	
	
	customer.setCoInfo(customerInfo);
	
	
	session.save(customer);
	session.getTransaction().commit();
	
	
	
	
	
}
}
