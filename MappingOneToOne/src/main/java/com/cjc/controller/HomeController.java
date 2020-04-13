package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cjc.model.Employee;
import com.cjc.servint.ServInt;

@Controller
public class HomeController {
	@Autowired
	private ServInt sr;
	
	@RequestMapping("/")
	public ModelAndView openLogin()
	{
		return new ModelAndView("login");
	}
	@RequestMapping("/register")
	public ModelAndView openRegister()
	{
		return new ModelAndView("register");
	}
	@RequestMapping("/reg")
	public ModelAndView addEmployee(@ModelAttribute Employee e)
	{
		System.out.println("add call");
		sr.addEmployee(e);
		return new ModelAndView("login");
	}
	@RequestMapping("/log")
	public ModelAndView dispayData(@RequestParam String uname,@RequestParam String password)
	{
		
		System.out.println("welcome login");
		System.out.println(uname+"\t"+password);
		if(uname.equals("a")&& password.equals("a"))
		{
			List<Employee> list=sr.displayData();
			for(Employee e:list)
			{
				System.out.println(e.getEid());
				System.out.println(e.getName());
				System.out.println(e.getAddress());
				System.out.println(e.getLogin().getUname());
				System.out.println(e.getLogin().getPassword());
			}
		return new ModelAndView("success","data",list);
		}
		else
		{
		return new ModelAndView("login");
		}
	}
	@RequestMapping("/edit")
	public ModelAndView editData(@RequestParam int eid)
	{
		Employee emp=sr.editData(eid);
		return new ModelAndView("edit","data",emp);
	}
	@RequestMapping("/update")
	public ModelAndView updateData(@ModelAttribute Employee e)
	{
		Employee emp=sr.updateData(e);
		List<Employee> emp1=new ArrayList<Employee>();
		emp1.add(emp);
		return new ModelAndView("success","data",emp1);
	}
	@RequestMapping("/delete")
	public ModelAndView deleteData(@RequestParam int eid)
	{
		List<Employee> emp=sr.deleteData(eid);
		return new ModelAndView("success","data",emp);
	}
	
	


}
