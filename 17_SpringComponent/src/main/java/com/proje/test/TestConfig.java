package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.DBConnection.DBConnection;
import com.proje.configclass.AppConfig;

public class TestConfig {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
	DBConnection connection= applicationContext.getBean(DBConnection.class);
	connection.openConnection();
	connection.closeConnection();
	
	
	applicationContext.close();

	}

}
