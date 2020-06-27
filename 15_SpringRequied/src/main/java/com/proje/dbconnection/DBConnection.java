package com.proje.dbconnection;

import org.springframework.beans.factory.annotation.*;

public class DBConnection {
	private String url;
	private String password;
	private String name;
	
	public void openConnection() {
		System.out.println("Connection opened");
	}
	public void closeConnection() {
		System.out.println("Connection closed");
	}
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}

	public DBConnection(String url, String password, String name) {
		super();
		this.url = url;
		this.password = password;
		this.name = name;
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getPassword() {
		return password;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DBConnecton [url=" + url + ", password=" + password + ", name=" + name + "]";
	}
	

}
