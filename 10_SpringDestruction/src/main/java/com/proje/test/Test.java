package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.DBConnection.DBConnection;



public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection=context.getBean("database",DBConnection.class);
		
		dbConnection.openConnection();
		
	
		context.close();
		
	}

}
