package com.proje.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.proje.databse.DataBase;
@Configuration
@PropertySource("db.properties")
public class AppConfig {
	@Value("${db.properties.url}")
	private String url;
	@Value("${db.properties.password}")
	private String pasword;
	@Value("${db.properties.password}")
	private String userName;
	@Bean
	public DataBase dataBase() {
		DataBase dataBase=new DataBase(this.url,this.userName,this.pasword);
	
		return dataBase;
		
	}

}
