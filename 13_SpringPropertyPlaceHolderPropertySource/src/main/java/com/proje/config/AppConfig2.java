package com.proje.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.proje.databse.DataBase;

@Configuration
@PropertySources({@PropertySource("db.properties")})
public class AppConfig2 {
	@Autowired
	private Environment environment;
	
	@Bean
	public DataBase dataBase() {
		
		
		DataBase dataBase=new DataBase(this.environment.getProperty("db.properties.url"), this.environment.getProperty("db.properties.url"),
				this.environment.getProperty("db.properties.userName"));
		
		return dataBase;
	}

}
