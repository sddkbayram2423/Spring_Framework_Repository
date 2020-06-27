package com.proje.DBConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proje.database.DataBase;
@Component
public class DBConnection {
	@Autowired
	private DataBase dataBase;
	@Autowired
	private DataBase dataBase2;
	
	public void openConnection() {
		System.out.println("database: "+ this.dataBase.toString());
		System.out.println("database2: "+this.dataBase2.toString());
		
		System.out.println("Connection opened");
	}
	public void closeConnection() {
		System.out.println("Connection closed");
	}
	
}
