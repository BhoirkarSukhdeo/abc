package com.cjc.serviceInterface;

import java.util.List;

import com.cjc.model.Employee;

public interface ServInterface {
	void addEmployee(Employee  emp);
	List<Employee> displayEmployee();
	Employee editData(int eid);
	List<Employee> updateData(Employee emp);
	List<Employee> deleteData(int emp);
	Employee getSingleData(String uname ,String password);
}
