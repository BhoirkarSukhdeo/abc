package com.cjc.daoimp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.dao;
import com.cjc.model.Employee;
@Repository
public class daoimp implements dao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addEmployee(Employee e) {
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		
	}

	@Override
	public List<Employee> displayData() {
		Session session=sf.openSession();
		session.beginTransaction();
		Query<Employee> q=session.createQuery("from Employee");
		List<Employee> list=q.getResultList();
		session.getTransaction().commit();
		
		return list;
	}

	@Override
	public Employee editData(int eid) {
		Session session=sf.openSession();
		session.beginTransaction();
		Query<Employee> q=session.createQuery("from Employee where eid='"+eid+"'");
		Employee emp=q.getSingleResult();
		session.getTransaction().commit();
		
		return emp;
	}

	@Override
	public Employee updateData(Employee emp) {
		Session session=sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(emp);
		
		Query<Employee> q=session.createQuery("from Employee where eid='"+emp.getEid()+"'");
		Employee emp1=q.getSingleResult();
		session.getTransaction().commit();

		return emp1;
	}

	@Override
	public List<Employee> deleteData(int eid) {
		Session session=sf.openSession();
		session.beginTransaction();
		Query<Employee> q=session.createQuery("delete from Employee where eid='"+eid+"'");
		q.executeUpdate();
		
		Query<Employee> q1=session.createQuery("from Employee");
		List<Employee> list=q1.getResultList();

		session.getTransaction().commit();
		
		return list;
	}
	
	

}
