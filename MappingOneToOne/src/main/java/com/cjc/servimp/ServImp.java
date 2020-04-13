package com.cjc.servimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.dao;
import com.cjc.model.Employee;
import com.cjc.servint.ServInt;
@Service
public class ServImp implements ServInt {
   @Autowired
   private dao d;
	
	@Override
	public void addEmployee(Employee e) {
		d.addEmployee(e);
		
	}

	@Override
	public List<Employee> displayData() {
		
		return d.displayData();
	}

	@Override
	public Employee editData(int eid) {
	
		return d.editData(eid);
	}

	@Override
	public Employee updateData(Employee emp) {
				
		return d.updateData(emp);
	}

	@Override
	public List<Employee> deleteData(int eid) {
		
		return d.deleteData(eid);
	}

}
