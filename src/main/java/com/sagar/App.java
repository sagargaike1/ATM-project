package com.sagar;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		session.beginTransaction();
		
		Student std = new Student();
		
		std.setId(1);
		std.setCourse_title("Java Full Stack devolopment");
		std.setMode("offline and online");
		std.setTrainer_name("sagar Gaike");
		std.setStart_time(9.15);
		std.setStart_date("23-march-2023");
		
		session.save(std);
		
		session.getTransaction().commit();
		
    }
}
