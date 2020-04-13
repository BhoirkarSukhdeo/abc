package com.cjc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service1.Conn;


@Controller
public class HomeController {
       @Autowired
	   private Conn sr;
	   @RequestMapping("/")
   	   public String indexOpen()
	   {
		   System.out.println("index open called");
		   return "index";
	   }
	   @RequestMapping("/register")
	   public String registerOpen()
	   {
		   System.out.println("register open called");
		   return "register";
	   }
	   @RequestMapping("/reg")
	   public String addStudent(@ModelAttribute Student s)
	   {
		   System.out.println("add student called");
		   System.out.println(s.getRollno());
		   System.out.println(s.getName());
		   System.out.println(s.getAddress());
		   System.out.println(s.getUname());
		   System.out.println(s.getPassword());
		   sr.addStudent(s);
		   System.out.println("end add student");
		   return "login";
	   }
	   @RequestMapping("/login")
	   public String loginOpen()
	   {
		   System.out.println("login open called");
		   return "login";
	   }
	   @RequestMapping("/log")
	   public String login(@RequestParam ("uname") String uname,@RequestParam ("password") String password, Model model)
	   {
		   System.out.println("login called");
		   if(uname.equals("admin") && password.equals("admin"))
		   {
			   List<Student> stud=sr.display(uname, password);
			   model.addAttribute("lists" ,stud);
			   
		   }
		   return "success";
	   }
	   @RequestMapping("/delete")
	   public String deletedata(@RequestParam String id)
	   {
		   int st=Integer.parseInt(id);
		   System.out.println("deletedata called");
		   sr.deleteData(st);
		   return "login";
	   }
	   @RequestMapping("/edit")
	   public String editdata(@RequestParam String id, Model model)
	   {
		   System.out.println("edit data called");
		   int st=Integer.parseInt(id);
		   Student s=sr.editData(st);
		   model.addAttribute("std",s);
		   return "edit";
	   }
	   @RequestMapping("/edit1")
	   public String updateData(@ModelAttribute Student s)
	   {
		   System.out.println("update called");
		   sr.updateData(s);
		   return "login";
	   }
	   @RequestMapping("/logout")
	   public String logout1() {
		   
		   return "login";
	   }
	   
	   
	   
}
