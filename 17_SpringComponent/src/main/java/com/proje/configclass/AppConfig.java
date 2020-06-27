package com.proje.configclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.proje.database.DataBase;
@Configuration
@ComponentScan("com.proje")
public class AppConfig {
	@Bean
	public DataBase dataBase() {
		
		DataBase dataBase=new DataBase("oracle", "bayram", "213456");
		return dataBase;
		
	}
	
	

}
