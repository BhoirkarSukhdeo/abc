package com.cjc.cong;

import java.sql.DriverManager;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.Employee;
import com.cjc.model.Login;
@EnableWebMvc
@ComponentScan(basePackages = "com")
@Configuration
public class SpringServlet {
	@Bean
	public InternalResourceViewResolver m1()
	{
		InternalResourceViewResolver r=new InternalResourceViewResolver();
		r.setPrefix("/view/");
		r.setSuffix(".jsp");
		
		return r;
	}
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dr=new DriverManagerDataSource();
		dr.setDriverClassName("com.mysql.jdbc.Driver");
		dr.setUrl("jdbc:mysql://localhost:3306/onecrud");
		dr.setUsername("root");
		dr.setPassword("root");
		return dr;
	}
	@Bean
	public LocalSessionFactoryBean localBaen()
	{
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(dataSource());
		Properties p=new Properties();

				p.setProperty("hibernate.hbm2ddl.auto", "update");
				p.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
				p.setProperty("hibernate.show_sql", "true");
				bean.setHibernateProperties(p);
				bean.setAnnotatedClasses(Employee.class,Login.class);
				
		return bean;
	}

}
