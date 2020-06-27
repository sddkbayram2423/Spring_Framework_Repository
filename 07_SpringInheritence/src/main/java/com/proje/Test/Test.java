package com.proje.Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.database.DataBase;

public class Test {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		System.out.println("---------------------------");
		DataBase connection1=context.getBean("databaseMySql",DataBase.class);
		System.out.println(connection1);
		
		System.out.println("---------------------------");
		DataBase connection2=context.getBean("databaseOracle",DataBase.class);
		System.out.println(connection2);
	
		context.close();
	}

}
