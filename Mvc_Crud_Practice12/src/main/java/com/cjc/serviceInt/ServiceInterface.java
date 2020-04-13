package com.cjc.serviceInt;

import java.util.List;

import com.cjc.model.Student;

public interface ServiceInterface {
	void addStudent(Student stud);
	List<Student> displayAllData(String uname,String password);
	Student displaySingleData(String uname,String password);
	Student edidData(int rollno);
	void updateStudData(Student s);
	void deleteStudData(int rollno);
	

}
