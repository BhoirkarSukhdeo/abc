package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.daointerface.dao;
import com.cjc.model.Employee;
import com.cjc.serviceInterface.ServInterface;
@Service
public class Servimp  implements ServInterface{
  @Autowired
  private dao d;
	@Override
	public void addEmployee(Employee emp) {
			d.addEmployee(emp);	
	}
	@Override
	public List<Employee> displayEmployee() {
		List<Employee> list=d.displayEmployee();
		return list;
	}
	@Override
	public Employee editData(int eid) {
		Employee list=d.editData(eid);
		return list;
	}
	@Override
	public List<Employee> updateData(Employee emp) {
		
		return d.updateData(emp);
	}
	@Override
	public List<Employee> deleteData(int emp) {
		
		return d.deleteData(emp);
	}
	@Override
	public Employee getSingleData(String uname, String password) {
				
		return d.getSingleData(uname, password);
	}

}
