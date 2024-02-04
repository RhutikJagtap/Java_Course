//Hibernate Program to Fetch/Read data from table
package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class Read {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		configuration.addAnnotatedClass(Student.class);

		SessionFactory sf = configuration.buildSessionFactory();

		Session session = sf.openSession();
		Student student = session.get(Student.class, 1);

		System.out.println("=========================");
		System.out.println("Succesfully Fetched.....");

		System.out.println(student);

		// Close the resources
		session.close();
		sf.close();

	}
}
