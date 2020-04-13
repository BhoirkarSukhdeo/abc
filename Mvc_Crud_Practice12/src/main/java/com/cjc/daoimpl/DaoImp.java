package com.cjc.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.cjc.daoint.Daoint;
import com.cjc.model.Student;
import com.cjc.util.HibernateUtil;
@Repository
public class DaoImp implements Daoint{

	@Override
	public void addStudent(Student stud) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(stud);
		session.getTransaction().commit();
	}

	@Override
	public List<Student> displayAllData(String uname, String password) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String hql="from Student";
		Query<Student> query=session.createQuery(hql);
		List<Student> slist=query.getResultList();
		return slist;
	}

	@Override
	public Student displaySingleData(String uname, String password) {
		System.out.println("display Single data called");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String hql="from Student where uname='"+uname+"' AND password='"+password+"'";
		Query<Student> q=session.createQuery(hql);
	  Student stud=(Student)q.getSingleResult();
	  System.out.println(stud.getName());
		return stud;
	}

	@Override
	public Student edidData(int rollno) {
		System.out.println("edit data called");
		Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println(rollno);
		session.beginTransaction();
		   String hql="from Student where rollno='"+rollno+"'";
			Query<Student> q=session.createQuery(hql);
			Student s=(Student)q.uniqueResult();
		
		return s;
	}

	@Override
	public void updateStudData(Student s) {
		System.out.println("dao updateData called");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String sql="update Student set name='"+s.getName()+"',address='"+s.getAddress()+"',uname='"+s.getUname()+"',password='"+s.getPassword()+"' where rollno='"+s.getRollno()+"'";
		Query<Student> q=session.createQuery(sql);
		q.executeUpdate();
		session.getTransaction().commit();
	}

	@Override
	public void deleteStudData(int rollno) {
		System.out.println("dao deletaData called");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println(rollno);
	     String sql="delete from Student where rollno='"+rollno+"'";
	     Query<Student> q=session.createQuery(sql);
	     q.executeUpdate();
		session.getTransaction().commit();
		System.out.println("end dao deleteData");
		
	}

}
