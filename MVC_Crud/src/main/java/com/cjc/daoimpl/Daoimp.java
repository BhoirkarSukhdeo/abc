package com.cjc.daoimpl;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.cjc.daointerface.ConnDao;
import com.cjc.hibernateutil.HibernateUtil;
import com.cjc.model.Student;
@Repository
public class Daoimp implements ConnDao {

	@Override
	public void addStudent(Student s) {
	System.out.println("add student dao");
  Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		System.out.println("add student dao end");
	}

	@Override
	public List<Student> display(String uname, String password) {
		System.out.println("dao display");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String sql="from Student";
		Query q=session.createQuery(sql);
		List<Student> l=q.getResultList();
		for(Student s:l)
		{
			System.out.println(s.getRollno());
			System.out.println(s.getName());
			System.out.println(s.getAddress());
			System.out.println(s.getUname());
			System.out.println(s.getPassword());
		}
		System.out.println("end display dao");
		return l;
	}

	@Override
	public void deleteData(int st) {
		System.out.println("dao deletaData called");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println(st);
	     String sql="delete from Student where rollno='"+st+"'";
	     Query<Student> q=session.createQuery(sql);
	     q.executeUpdate();
		session.getTransaction().commit();
		System.out.println("end dao deleteData");
	}

	@Override
	public Student editData(int st) {
		System.out.println(" dao edit data called");
		Session session=HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	        
	    String hql="from Student where rollno='"+st+"'";
		Query<Student> q=session.createQuery(hql);
		Student s=(Student)q.uniqueResult();
		System.out.println(s.getName());
		System.out.println(s.getRollno());
	    return s;
	}

	@Override
	public void updateData(Student s) {
		System.out.println("dao updateData called");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String sql="update Student set name='"+s.getName()+"',address='"+s.getAddress()+"',uname='"+s.getUname()+"',password='"+s.getPassword()+"' where rollno='"+s.getRollno()+"'";
		Query<Student> q=session.createQuery(sql);
		q.executeUpdate();
		session.getTransaction().commit();
	}
	

}
