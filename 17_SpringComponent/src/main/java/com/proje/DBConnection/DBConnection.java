package com.proje.DBConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proje.database.DataBase;
@Component
public class DBConnection {
	@Autowired
	private DataBase dataBase;
	@Autowired
	private DataBase dataBase3;

	
	public void openConnection() {
		System.out.println("------------------------------");
		System.out.println("1. "+this.dataBase.toString());
		System.out.println("------------------------------");
		System.out.println("2. "+this.dataBase3.toString());

		
		System.out.println("Connection opened");
	}
	public void closeConnection() {
		System.out.println("connction closed");
	}
	
}
