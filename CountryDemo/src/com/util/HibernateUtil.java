package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
public static Session sessionReturn(){
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		return session;
	
	}
}
