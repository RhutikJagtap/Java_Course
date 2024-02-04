//Hibernate  Program to insert data into table
package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class Insert {
	public static void main(String[] args) {
		// Create Configuration class object
		Configuration configuration = new Configuration();
		configuration.configure();

		configuration.addAnnotatedClass(Student.class);

		// Create SessionFactory object
		SessionFactory sf = configuration.buildSessionFactory();

		// Create Session object
		Session session = sf.openSession();

		Student student1 = new Student();
		//set data in setter method
		student1.setId(1);
		student1.setName("Rhutik Jagtap");
		student1.setEmailId("rhutikjagtap68@gmail.com");

		//set data in Constructor
		Student student2=new Student(2,"Amaol Jagtap","amoal7385@gmail.com");
		
		// Create Transaction object
		Transaction tx = session.beginTransaction();

		// Perform the Persistence Operations
		session.save(student1);
		session.save(student2);
		tx.commit();

		System.out.println("============================");
		System.out.println("Successfully inserted......");
		System.out.println(student1);
		System.out.println(student2);

		// Close the resources
		session.close();
		sf.close();

	}

}
