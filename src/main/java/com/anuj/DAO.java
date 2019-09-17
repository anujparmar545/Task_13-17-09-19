package com.anuj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAO {
	
	private static SessionFactory sf=Utility.getSF();
	
	public void insertProjects(Project project)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(project);
		tr.commit();
		session.close();
		
		System.out.println("Project Stored Successfully");
	}
	
	public void insertEmployees(Employee emp)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
		
		System.out.println("Employee Stored Successfully");
	}
	
	public void insertLaptops(Laptop laptop)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(laptop);
		tr.commit();
		session.close();
		
		System.out.println("Laptop Stored Successfully");
	}
	
	public void insertVehicles(Vehicle vehicle)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(vehicle);
		tr.commit();
		session.close();
		
		System.out.println("VEHICLES Stored Successfully");
	}
	
}
