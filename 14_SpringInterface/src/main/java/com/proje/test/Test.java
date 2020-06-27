package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.repository.DBConnectionRepository;
import com.proje.repositoryImp.MySqlDBConnectionRepositoryImp;
import com.proje.repositoryImp.OracleDBConnectionRepositoryImp;

public class Test {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	DBConnectionRepository connectionRepository=applicationContext.getBean("mysqlConnection",MySqlDBConnectionRepositoryImp.class);
	connectionRepository.openConnection();
	connectionRepository.closeConnetion();
	System.out.println("------------------------------------------------------");
	DBConnectionRepository connectionRepository2=applicationContext.getBean("oracleConnection",OracleDBConnectionRepositoryImp.class);
	connectionRepository2.openConnection();
	connectionRepository2.closeConnetion();
	
	
	applicationContext.close();
	}

}
