package com.proje.database;

public class DataBase {
	
	private String url;
	private String username;
	private String pasword;
	
	public DataBase(String url, String username, String pasword) {
		super();
		this.url = url;
		this.username = username;
		this.pasword = pasword;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	

}
