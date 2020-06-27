package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.DBConnection.DBConnection;
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

}
