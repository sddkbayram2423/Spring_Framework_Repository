package com.proje.config;


import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.DBConnection.DBConnection;
import com.proje.beanPostProcesor.PostProcesor;

@Configuration
public class AppConfig {
	@Bean(initMethod="volidation",destroyMethod="closeConnection")
	public DBConnection dbConnection() {
		DBConnection dbConnection=new DBConnection();
		dbConnection.setPassword("454+64");
		dbConnection.setUrl("Oacle:jdbc");
		dbConnection.setUserName("asfasdf");
		
		return dbConnection;
		
	}
	@Bean
	public BeanPostProcessor beanFactory() {
		return new PostProcesor() ;
	}

}
