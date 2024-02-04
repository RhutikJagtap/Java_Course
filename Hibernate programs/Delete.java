//Hibernate Program to delete data from table
package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class Delete {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		configuration.addAnnotatedClass(Student.class);

		SessionFactory sf = configuration.buildSessionFactory();

		Session session = sf.openSession();

		Student student = session.get(Student.class, 2);

		Transaction tx = session.beginTransaction();
		session.delete(student);
		tx.commit();

		System.out.println("============================");
		System.out.println("Succesfully Deleted.....");
		System.out.println(student);

		// Close the resources
		session.close();
		sf.close();

	}

}
