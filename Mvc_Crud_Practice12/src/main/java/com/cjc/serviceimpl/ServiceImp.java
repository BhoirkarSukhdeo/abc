package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.daoint.Daoint;
import com.cjc.model.Student;
import com.cjc.serviceInt.ServiceInterface;
@Service
public class ServiceImp  implements ServiceInterface{

	@Autowired
	Daoint d;
	@Override
	public void addStudent(Student stud) {
		d.addStudent(stud);
		
	}
	@Override
	public List<Student> displayAllData(String uname, String password) {
	
		return d.displayAllData(uname, password);
	}
	@Override
	public Student displaySingleData(String uname, String password) {
		
		return d.displaySingleData(uname, password);
	}
	@Override
	public Student edidData(int rollno) {
		
		return d.edidData(rollno);
	}
	@Override
	public void updateStudData(Student s) {
	d.updateStudData(s);
		
	}
	@Override
	public void deleteStudData(int rollno) {
		d.deleteStudData(rollno);
		
	}

}
