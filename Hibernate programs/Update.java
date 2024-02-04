//Hibernate Program to Update data in table
package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class Update {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		configuration.addAnnotatedClass(Student.class);

		SessionFactory sf = configuration.buildSessionFactory();

		Session session = sf.openSession();

		Student student = session.get(Student.class, 1);
		student.setName("Rj");
		student.setEmailId("rj5588@gmail.com");

		Transaction tx = session.beginTransaction();
		session.update(student);
		tx.commit();

		System.out.println("============================");
		System.out.println("Succesfully Updated.....");
		System.out.println(student);

		// Close the resources
		session.close();
		sf.close();

	}

}
