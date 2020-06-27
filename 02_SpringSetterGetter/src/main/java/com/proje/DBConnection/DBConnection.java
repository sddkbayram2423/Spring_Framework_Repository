package com.proje.DBConnection;

public class DBConnection {
	
	private String url;
	private String userName;
	private String password;
	
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public void openConnection() {
		System.out.println("Url: "+this.url);
		System.out.println("userName: "+this.userName);
		System.out.println("Password: "+this.password);
		System.out.println("Baðlanti açildi");
	}public void closeConnection() {
	
		System.out.println("Baðlanti kapandi");
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
	

}
