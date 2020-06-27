package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.databse.DataBase;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataBase dataBase=context.getBean("database",DataBase.class);
		
		System.out.println(dataBase);
		
		context.close();

	}

}
