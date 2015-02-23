package generateprimarykey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class EmployeeTest 
{
	
	public static void main(String[] args) 
	{
	
	AnnotationConfiguration configuration=new AnnotationConfiguration();
	configuration.addAnnotatedClass(Employee.class);
	
	configuration.configure("hibernate.cfg.xml");
	
	//new SchemaExport(configuration).create(true, true);
	
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
	
	session.beginTransaction();
	
	Employee employee=new Employee();
	//employee.setEmpId(100);
	employee.setEmpName("rahul moundekar");
	employee.setEmpAddr("wadgaonsheri pune");
	employee.setEmpEmail("rahulmoundekar44@gmail.com");
	
	Employee employee1=new Employee();
	employee1.setEmpName("dinesh moundekar");
	employee1.setEmpAddr("wadgaonsheri pune");
	employee1.setEmpEmail("dineshmoundekar44@gmail.com");
	
	
	Employee employee2=new Employee();
	employee2.setEmpName("usha moundekar");
	employee2.setEmpAddr("wadgaonsheri pune");
	employee2.setEmpEmail("ushamoundekar44@gmail.com");
	
	Employee employee3=new Employee();
	employee3.setEmpName("yogeshwar moundekar");
	employee3.setEmpAddr("wadgaonsheri pune");
	employee3.setEmpEmail("yogeshwarmoundekar44@gmail.com");
	
	
	Employee employee4=new Employee();
	//employee.setEmpId(100);
	employee4.setEmpName("rahul moundekar");
	employee4.setEmpAddr("wadgaonsheri pune");
	employee4.setEmpEmail("rahulmoundekar44@gmail.com");
	
	Employee employee5=new Employee();
	employee5.setEmpName("dinesh moundekar");
	employee5.setEmpAddr("wadgaonsheri pune");
	employee5.setEmpEmail("dineshmoundekar44@gmail.com");
	
	
	Employee employee6=new Employee();
	employee6.setEmpName("usha moundekar");
	employee6.setEmpAddr("wadgaonsheri pune");
	employee6.setEmpEmail("ushamoundekar44@gmail.com");
	
	Employee employee7=new Employee();
	employee7.setEmpName("yogeshwar moundekar");
	employee7.setEmpAddr("wadgaonsheri pune");
	employee7.setEmpEmail("yogeshwarmoundekar44@gmail.com");
	
	
	
	
	session.save(employee);
	session.save(employee1);
	session.save(employee2);
	session.save(employee3);
	session.save(employee4);
	session.save(employee5);
	session.save(employee6);
	session.save(employee7);
	session.getTransaction().commit();
	
	
	
	
	
	
	}
}
