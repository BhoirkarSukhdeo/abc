package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cjc.model.Employee;
import com.cjc.serviceInterface.ServInterface;

@Controller
public class HomeController {
	@Autowired
	private ServInterface sr;
	@RequestMapping("/")
	public ModelAndView loginOpen()
	{
		return new ModelAndView("login");
	}
	@RequestMapping("/register")
	public ModelAndView registerOpen()
	{
		return new ModelAndView("register");
	}
	@RequestMapping("/reg")
	public ModelAndView addEmployee(@ModelAttribute Employee emp)
	{
		 sr.addEmployee(emp);
		return new ModelAndView("login");
	}
	
	@RequestMapping("/log")
	public ModelAndView displayEmployee(@RequestParam String uname,@RequestParam String password)
	{ 
		Employee e=sr.getSingleData(uname ,password );
		System.out.println("home display");
		if(uname.equals("admin")&& password.equals("admin143"))
		{
		List<Employee> list=sr.displayEmployee();
		
		return new ModelAndView("success","data",list);
	}
		else
		{
			if(uname.equals(e.getUname())&& password.equals(e.getPassword()))
			{
				List<Employee> list=new ArrayList<Employee>();
				Employee emp=sr.getSingleData(uname, password);
				list.add(emp);
				return new ModelAndView("success", "data",list);
			}
			else 
			{
		    System.out.println("Enter valid username and password");
			return new ModelAndView("login");
			}
		}
	}
	@RequestMapping("/edit")
	public ModelAndView editData(@RequestParam int eid)
	{
		System.out.println(eid);
		Employee list =sr.editData(eid);
		System.out.println("end edit");
		return new ModelAndView("edit", "data",list);
	}
	@RequestMapping("/update")
	public ModelAndView updateData(@ModelAttribute Employee emp)
	{
		System.out.println("update home");
		List<Employee> list =sr.updateData(emp);
		return new ModelAndView("success", "data",list);
	}
	@RequestMapping("/del")
	public ModelAndView deleteData(@RequestParam int eid)
	{
		System.out.println("delete home");
		List<Employee> list =sr.deleteData(eid);
		return new ModelAndView("success", "data",list);
	}
	

}
