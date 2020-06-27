package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;
import com.proje.databse.DataBase;

public class TestConfig {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		DataBase base=applicationContext.getBean("dataBase",DataBase.class);
		System.out.println(base);
		
		
		applicationContext.close();

	}

}
