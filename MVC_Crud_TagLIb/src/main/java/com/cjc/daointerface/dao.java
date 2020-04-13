package com.cjc.daointerface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;

public interface dao {
	void addEmployee(Employee  emp);
	List<Employee> displayEmployee();
    Employee editData(int eid);
	List<Employee> updateData(Employee emp);
	List<Employee> deleteData(int emp);
	Employee getSingleData(String uname ,String password);
}
