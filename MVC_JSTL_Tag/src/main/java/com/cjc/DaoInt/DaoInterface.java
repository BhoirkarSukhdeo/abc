package com.cjc.DaoInt;

import com.cjc.model.Student;

public interface DaoInterface {
	void addStudent(Student std);
	Student displayStudData(String uname,String password);
	Student editStudent(int rollno);
	void updateStudent(Student std);
	void deleteStudent(int rollno);
}
