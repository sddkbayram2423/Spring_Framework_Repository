package com.proje.Config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.DBConnection.DBConnection;

@Configuration
public class AppConfig {
	@Bean
	public DBConnection dbConnection() {

		List<String> list = new ArrayList<String>();
		list.add("minimum baglanti");
		list.add("maximum baglanti");
		list.add("gereksiz baglanti");

		Map<String, String> maps = new HashMap<String, String>();
		maps.put("min", "5");
		maps.put("max", "50");
		maps.put("satement", "40");

		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "123456987");

		DBConnection connection = new DBConnection();
		connection.setList(list);
		connection.setMaps(maps);
		connection.setProps(properties);
		connection.setPassword("2131");
		connection.setUsername("user1");

		return connection;
	}

}
