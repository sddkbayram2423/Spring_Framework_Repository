package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.DBConnection.DBConnection;
import com.proje.config.AppConfig;

public class TestConfig {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	DBConnection connection=context.getBean("dbConnection",DBConnection.class);
	
	connection.openConnection();


	
	
	context.close();
	}

}
