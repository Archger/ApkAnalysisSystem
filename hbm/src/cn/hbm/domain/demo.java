package cn.hbm.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.hbm.cfg.Student;
import cn.hbm.cfg.StudentId;


public class demo {  
    @Test
    public void insert(){  
    	Configuration conf = new Configuration().configure();
		
		SessionFactory sessionFactory = conf.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Session session2 = sessionFactory.getCurrentSession();
	
		Transaction tx = session.beginTransaction();
		//----------------------------------------------
		StudentId sid = new StudentId();
		Student s = new Student();
		System.out.println(session==session2);
		//----------------------------------------------
		tx.commit();
		session.close();
		sessionFactory.close();
    }  
}  
