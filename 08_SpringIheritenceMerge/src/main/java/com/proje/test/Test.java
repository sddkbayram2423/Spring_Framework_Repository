package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.database.DataBase;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DataBase dataBase=context.getBean("databaseOracle",DataBase.class);		
		System.out.println(dataBase);
		System.out.println("-------------------------");
		
		DataBase dataBase1=context.getBean("databaseMySql",DataBase.class);
		System.out.println(dataBase1);
		

		
		context.close();
		
	}

}
