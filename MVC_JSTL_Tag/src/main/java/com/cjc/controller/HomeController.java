package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cjc.model.Student;
import com.cjc.serviceInt.ServInterface;

@Controller
public class HomeController {
	@Autowired
	ServInterface sr;
	@RequestMapping("/")
	public ModelAndView indexOpen()
	{
		ModelAndView model=new ModelAndView("login");
		return model;
	}
	
	@RequestMapping("/reg")
	  public ModelAndView registerOpen()
	  { 
        
		
		ModelAndView model=new ModelAndView("register");
        return model;
	 }
	@RequestMapping("/register")
	public ModelAndView addStudent(@ModelAttribute Student std)
	{
		System.out.println("add Student called");
		sr.addStudent(std);
		ModelAndView model=new ModelAndView("login");
		return model;
	}
	@RequestMapping("/log")
	  public ModelAndView loginOpen(@RequestParam String uname,@RequestParam String password)
	  { 
       if(uname.equals("a")&& password.equals("a"))
       {
    	   System.out.println(uname+"\t"+password);
    	   List<Student> st1=new ArrayList();
    	 Student st=sr.displayStudData(uname, password);
    	 System.out.println(st.getName());
    	 System.out.println(st.getAddress());
    	 st1.add(st);  
    	 ModelAndView model=new ModelAndView("success","list", st1); 
    	   return model;
       }
       else {
    	   System.out.println("Enter Valid User Name And Password");
    	   ModelAndView model=new ModelAndView("register");
    	   
    	      return model;
       }
		
	 }
	@RequestMapping("/edit")
	public ModelAndView editStudent(@RequestParam int rollno)
	{
		List<Student> st=new ArrayList();
		System.out.println("edit Student called");
		System.out.println(rollno);
		Student st1=sr.editStudent(rollno);
		st.add(st1);
	    return new ModelAndView("edit","list",st);
	}
	@RequestMapping("/update")
	public ModelAndView updateStudent(@ModelAttribute Student std)
	{
		System.out.println("update Student called");
		sr.updateStudent(std);
	    return new ModelAndView("login");
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@RequestParam int rollno)
	{
		System.out.println("delete Student called");
		sr.deleteStudent(rollno);
	    return new ModelAndView("login");
	}
	 
}
