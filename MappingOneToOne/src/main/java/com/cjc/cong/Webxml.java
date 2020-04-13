package com.cjc.cong;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Webxml implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
     AnnotationConfigWebApplicationContext a=new AnnotationConfigWebApplicationContext();
     a.register(SpringServlet.class);
     ServletRegistration.Dynamic  sr=servletContext.addServlet("dispatcherServlet", new DispatcherServlet(a));
	sr.addMapping("/");
	}
	
}
