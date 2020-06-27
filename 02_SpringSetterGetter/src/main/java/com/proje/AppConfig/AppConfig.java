package com.proje.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.DBConnection.DBConnection;
@Configuration
public class AppConfig {
	@Bean(name="classApp")
	public DBConnection dbConnection() {
		DBConnection connection=new DBConnection();
		connection.setPassword("1234");
		connection.setUrl("jdbc:mysql://localhost:3306/deneme?serverTimezone=Turkey");
		connection.setUserName("root");
	
	return connection;
	
	}

}
