package com.proje.AppConfig;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.DBConnection.DBConnection;



public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		DBConnection connection=applicationContext.getBean("classApp",DBConnection.class);
		
		connection.openConnection();
		connection.closeConnection();
		applicationContext.close();
		
	}

}
