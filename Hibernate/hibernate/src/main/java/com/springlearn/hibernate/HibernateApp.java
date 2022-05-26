package com.springlearn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		session.save(new Student("ABD123", "Abdul", "Waris", "waris@gmail.com"));
		
		session.getTransaction().commit();
		
	}

}
