package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.DBConnection.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationConetxt.xml");
		DBConnection dbConnection=context.getBean("veritabani",DBConnection.class);
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		context.close();

	}

}
