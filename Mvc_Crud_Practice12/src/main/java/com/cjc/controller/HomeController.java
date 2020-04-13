package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.serviceInt.ServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	ServiceInterface sr;

	@RequestMapping("/")
	public String loginOpen() {
		System.out.println("login open called");
		return "login";
	}

	@RequestMapping("/reg")
	public String registerOpen() {
		System.out.println("register page open");
		return "register";
	}

	@RequestMapping("/register")
	public String addEmployee(@ModelAttribute Student stud) {
		sr.addStudent(stud);
		return "login";
	}

	@RequestMapping("/log")
	public String login(@RequestParam String uname, @RequestParam String password, Model model) {
		
		Student st = sr.displaySingleData(uname, password);
		System.out.println(st.getUname());
		System.out.println(st.getPassword());
		/*
		 * if (uname.equals(st.getUname()) && password.equals(st.getPassword())) {
		 * List<Student> lists = sr.displayAllData(uname, password);
		 * model.addAttribute("list", lists); return "success"; }else
		 */
		
		if(uname.equals(st.getUname())&& password.equals(st.getPassword())) {
			  Student std = sr.displaySingleData(uname, password);
		      List<Student> l=new ArrayList(); 
		      l.add(std);
			  model.addAttribute("list", l);
		       return "success";
		  }
	 else {
			System.out.println("plz Enter Valid UserName And Password");
		    
			return "register";
		 }
			
	}
	
	
	  @RequestMapping("/edit") 
	  public String editData(@RequestParam int rollno,Model model) 
	  {
		
		  System.out.println(rollno); 
		  Student st=sr.edidData(rollno);
		  model.addAttribute("list", st);
		 
		  return "edit"; 
		  
	  }
	  @RequestMapping("/update")
	 public String updateStudData(@ModelAttribute Student s)
	 {
		  sr.updateStudData(s);
		 return "login";
	 }
	  @RequestMapping("/delete")
	 public String DeleteStudData(@RequestParam int rollno)
	 {
		  sr.deleteStudData(rollno);
		 return "login";
	 }

}
