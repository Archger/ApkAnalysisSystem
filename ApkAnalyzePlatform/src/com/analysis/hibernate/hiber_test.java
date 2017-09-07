package com.analysis.hibernate;


import org.hibernate.*;
import org.hibernate.cfg.*;
import org.junit.Test;

public class hiber_test {
	
	@Test
	public void fun1()
	{
		Configuration conf=new Configuration();
		SessionFactory sf =conf.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();
		//--------------------------------------
		
		User u1=new User();
		u1.setUsername("admin1");
		u1.setPassword("password");
		u1.setUpload(true);
		u1.setDownload(true);
		u1.setIsAdmin(true);
		
		session.save(u1);
		
		//--------------------------------------
		tx.commit();
		session.close();
	}
}
