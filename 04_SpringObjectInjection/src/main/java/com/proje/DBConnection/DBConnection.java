package com.proje.DBConnection;

import com.proje.database.Database;

public class DBConnection {
	
	private Database database=new Database();

	public void openConnection() {
		System.out.println("Url: "+this.database.getUrl());
		System.out.println("userName: "+this.database.getUsername());
		System.out.println("Password: "+this.database.getPassword());
		System.out.println("Baðlantý açýldý");
	}public void closeConnection() {
	
		System.out.println("Baðlantý kapandý");
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	

}
