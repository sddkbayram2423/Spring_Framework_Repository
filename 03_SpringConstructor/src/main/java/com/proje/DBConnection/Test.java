package com.proje.DBConnection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("---------------------------------");
		DBConnection connection=context.getBean("dbConnection",DBConnection.class);
		connection.openConnection();
		connection.closeConnection();
		
		System.out.println("---------------------------------");
		DBConnection connection1=context.getBean("dbConnetionByIndex",DBConnection.class);
		connection1.openConnection();
		connection1.closeConnection();
		System.out.println("---------------------------------");
		DBConnection connection2=context.getBean("dbConnectionOzel",DBConnection.class);
		connection2.openConnection();
		connection2.closeConnection();
		System.out.println("---------------------------------");
		
		context.close();
	}

}
