package com.cjc.service1;

import java.util.List;

import com.cjc.model.Student;

public interface Conn {
	void addStudent(Student s);
	List<Student> display(String uname,String password);
    void deleteData(int st);
    Student editData(int st);
    void updateData(Student s);

}
