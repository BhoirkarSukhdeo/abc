package com.wcs.log4j2;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4J2ExampleInSpringBootApplication {
	private static final Logger logger = java.util.logging.Logger.getLogger(Log4J2ExampleInSpringBootApplication.class.getName());


	public static void main(String[] args) {
		System.out.println("Current Directory = " + System.getProperty("user.dir"));
		
		System.out.println("hiii...");
		SpringApplication.run(Log4J2ExampleInSpringBootApplication.class, args);
		
		logger.info(" info logger....");
		logger.warning(" warring msg....");
		logger.getName();
		
	
	
	}

}
