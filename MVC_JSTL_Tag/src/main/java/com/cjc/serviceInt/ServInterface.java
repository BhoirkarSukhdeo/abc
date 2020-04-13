package com.cjc.serviceInt;

import com.cjc.model.Student;

public interface ServInterface {
	void addStudent(Student std);
	Student displayStudData(String uname,String password); 
    Student editStudent(int rollno);
    void updateStudent(Student std);
    void deleteStudent(int rollno);
}
