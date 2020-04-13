package com.cjc.DaoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.DaoInt.DaoInterface;
import com.cjc.model.Student;
@Repository
public class DaoImplem implements DaoInterface{
   @Autowired
   SessionFactory sf;
	@Override
	public void addStudent(Student std) {
		System.out.println("dao add Student called");
	Session session=sf.openSession();
	session.beginTransaction();
	session.save(std);
	session.getTransaction().commit();
		
	}
	@Override
	public Student displayStudData(String uname, String password) {
	 Session session=sf.openSession();
	    session.beginTransaction();
	    String hql="from Student where uname='"+uname+"' AND password='"+password+"'";
	    Query<Student> q=session.createQuery(hql);
	    Student st=q.uniqueResult();
	    session.getTransaction().commit();
		return st;
	}
	@Override
	public Student editStudent(int rollno) {
	 System.out.println("dao edit Student called");
	 Session session=sf.openSession();
	 session.beginTransaction();
	 String hql="from Student where rollno=?";
	 Query<Student> q=session.createQuery(hql);
	 q.setParameter(0, rollno);
	 Student st=(Student)q.getSingleResult();
		return st;
	}
	@Override
	public void updateStudent(Student std) {
		System.out.println("dao update Student called");
		Session session=sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(std);
		session.getTransaction().commit();
	}
	@Override
	public void deleteStudent(int rollno) {
		System.out.println("dao delete Student called");
         Session session=sf.openSession();
         session.beginTransaction();
         String hql="delete from Student where rollno=?";
         Query<Student> q=session.createQuery(hql);
         q.setParameter(0, rollno);
         q.executeUpdate();
         session.getTransaction().commit();
	}

}
