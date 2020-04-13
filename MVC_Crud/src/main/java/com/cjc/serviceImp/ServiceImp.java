package com.cjc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.daointerface.ConnDao;
import com.cjc.model.Student;
import com.cjc.service1.Conn;
@Service
public class ServiceImp implements Conn {
    @Autowired
	private ConnDao d;
	@Override
	public void addStudent(Student s) {
		System.out.println("add student service");
		d.addStudent(s);
		
	}
	@Override
	public List<Student> display(String uname, String password) {
		System.out.println("display service");
		List<Student> list=d.display(uname, password);
		return list;
	}
	@Override
	public void deleteData(int id) {
		System.out.println("service deletedata called");
		d.deleteData(id);
		
	}
	@Override
	public Student editData(int st) {
		System.out.println("Service editData called");
		Student s=d.editData(st);
		return s;
	}
	@Override
	public void updateData(Student s) {
		System.out.println("Service updateData called");
		d.updateData(s);
	}

}
