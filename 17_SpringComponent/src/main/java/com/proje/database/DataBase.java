package com.proje.database;

public class DataBase {
	
	private String url;
	private String userName;
	private String password;
	
	public DataBase() {
		// TODO Auto-generated constructor stub
	}
	public DataBase(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DataBase [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
