package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.DBConnection.DBConnection;
import com.proje.database.Database;

@Configuration
public class AppConfig {
	
	public Database database() {
		Database database=new Database("jdbc:mysql", "root", "123456");
		return database;
	}
	@Bean
	public DBConnection dbConnection() {
		DBConnection dbConnection=new DBConnection();
		dbConnection.setDatabase(this.database());
		return dbConnection;
		
		
	}

}
