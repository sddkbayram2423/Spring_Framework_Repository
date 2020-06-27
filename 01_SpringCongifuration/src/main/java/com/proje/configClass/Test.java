package com.proje.configClass;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.db.DBConnection;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		DBConnection connection=(DBConnection) applicationContext.getBean("dbConnection");
		connection.openConnection();
		connection.closeConnection();
		applicationContext.close();

	}

}
