package com.cjc.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.daointerface.dao;
import com.cjc.model.Employee;

@Repository
public class DaoImp implements dao {
	@Autowired
     dao d;
	@Autowired
    SessionFactory sf;
	@Override
	public void addEmployee(Employee emp) {
	Session session=sf.openSession();
	session.beginTransaction();
	session.persist(emp);
	session.getTransaction().commit();
		
	}
	@Override
	public  List<Employee> displayEmployee() {
		System.out.println("dao display");
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="from Employee";
		Query<Employee> q=session.createQuery(hql);
		List<Employee> list=q.getResultList();
		session.getTransaction().commit();
		return list;
	}
	@Override
	public Employee editData(int eid) {
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="from Employee where eid='"+eid+"'";
		Query<Employee> q=session.createQuery(hql);
		Employee l=q.uniqueResult();
		/*
		 * System.out.println(eid); List<Employee> l=d.displayEmployee();
		 * System.out.println(l); for(Employee e:l) {
		 * System.out.println(e.getAddress()); System.out.println(e.getName()); }
		 */		session.getTransaction().commit();
		return l;
	}
	@Override
	public List<Employee> updateData(Employee emp) {
		Session session=sf.openSession();
		session.beginTransaction();
		System.out.println("dao update");
		session.save(emp);
		session.getTransaction().commit();
		System.out.println("dao end update");
		return d.displayEmployee();
	}
	@Override
	public List<Employee> deleteData(int emp) {
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="delete  from Employee where eid=?";
		Query<Employee> q=session.createQuery(hql);
		q.setParameter(0, emp);
		q.executeUpdate();
		session.getTransaction().commit();

		return d.displayEmployee();
	}
	@Override
	public Employee getSingleData(String uname, String password) {
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="from Employee where uname=? and password=?";
		Query<Employee> q=session.createQuery(hql);
		q.setParameter(0, uname);
		q.setParameter(1, password);
		Employee emp=q.uniqueResult();
        return emp;
	}
	

}
