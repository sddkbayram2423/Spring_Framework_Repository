package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig2;
import com.proje.databse.DataBase;

public class TestConfig2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig2.class);
		DataBase base=applicationContext.getBean("dataBase",DataBase.class);
		System.out.println(base);
		
		
		applicationContext.close();

	}

}
