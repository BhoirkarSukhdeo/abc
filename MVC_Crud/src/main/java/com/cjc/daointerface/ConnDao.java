package com.cjc.daointerface;

import java.util.List;

import com.cjc.model.Student;

public interface ConnDao {
	void addStudent(Student s);
    List<Student> display(String uname,String password);
    void deleteData(int id);
    Student editData(int st);
    void updateData(Student s);
}
