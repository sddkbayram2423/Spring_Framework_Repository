package com.proje.db;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		System.out.println("----------------------------------------------");
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection bconnection=(DBConnection) beanFactory.getBean("dbConnection");
		bconnection.openConnection();
		bconnection.closeConnection();
		
		
		
		System.out.println("----------------------------------------------");
		@SuppressWarnings("unused")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection bconnection1=(DBConnection) beanFactory.getBean("dbConnection");
		bconnection1.openConnection();
		bconnection1.closeConnection();
		
		
		System.out.println("----------------------------------------------");
		ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection bconnection2=(DBConnection) classPathXmlApplicationContext.getBean("dbConnection");
		bconnection2.openConnection();
		bconnection2.closeConnection();
		
		
		System.out.println("----------------------------------------------");
		ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection bconnection3=(DBConnection) configurableApplicationContext.getBean("dbConnection");
		bconnection3.openConnection();
		bconnection3.closeConnection();
		
		
		System.out.println("----------------------------------------------");
		AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection bconnection4=(DBConnection) abstractApplicationContext.getBean("dbConnection");
		bconnection4.openConnection();
		bconnection4.closeConnection();
		System.out.println("----------------------------------------------");
		
		
		abstractApplicationContext.close();
		configurableApplicationContext.close();
		classPathXmlApplicationContext.close();
		

	}

}
