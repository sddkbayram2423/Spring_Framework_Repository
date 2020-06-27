package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.dbconnection.DBConnection;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection connection=applicationContext.getBean("database",DBConnection.class);
		connection.openConnection();
		connection.closeConnection();
		applicationContext.close();
	}

}
