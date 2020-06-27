package com.proje.configClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;
@Configuration
public class AppConfig {
	@Bean
	public DBConnection dbConnection() {
		DBConnection connection=new DBConnection();
		
		return connection;
	}

}
