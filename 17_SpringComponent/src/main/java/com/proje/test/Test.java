package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.DBConnection.DBConnection;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection=applicationContext.getBean("dbConnection",DBConnection.class);
		dbConnection.openConnection();
		dbConnection.closeConnection();
		applicationContext.close();
	}

}
