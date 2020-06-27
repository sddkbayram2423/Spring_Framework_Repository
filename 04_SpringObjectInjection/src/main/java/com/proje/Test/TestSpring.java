package com.proje.Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.DBConnection.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	DBConnection connection=context.getBean("dbConnection",DBConnection.class);
	
	connection.openConnection();
	connection.closeConnection();
	context.close();

	}

}
