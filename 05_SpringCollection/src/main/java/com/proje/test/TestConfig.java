package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.Config.AppConfig;
import com.proje.DBConnection.DBConnection;

public class TestConfig {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		DBConnection connection=(DBConnection) context.getBean("dbConnection");
		
		connection.openConnection();
		connection.closeConnection();
		
		context.close();

	}

}
