package com.cjc.dao;

import java.util.List;

import com.cjc.model.Employee;

public interface dao {
	void addEmployee(Employee e);
	List<Employee> displayData();
	Employee editData(int eid);
	Employee updateData(Employee emp);
	List<Employee> deleteData(int eid);


}
