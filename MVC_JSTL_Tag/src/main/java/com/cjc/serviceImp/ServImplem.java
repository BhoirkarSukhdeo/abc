package com.cjc.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.DaoInt.DaoInterface;
import com.cjc.model.Student;
import com.cjc.serviceInt.ServInterface;
@Service
public class ServImplem implements ServInterface {
    @Autowired
    DaoInterface d;
	@Override
	public void addStudent(Student std) {
		System.out.println("Service add Student Called");
	d.addStudent(std);
		
	}
	@Override
	public Student displayStudData(String uname, String password) {
		Student s=d.displayStudData(uname, password);
		return s;
	}
	@Override
	public Student editStudent(int rollno) {
	
		return d.editStudent(rollno);
	}
	@Override
	public void updateStudent(Student std) {
		d.updateStudent(std);
	}
	@Override
	public void deleteStudent(int rollno) {
		d.deleteStudent(rollno);	}
	

}
