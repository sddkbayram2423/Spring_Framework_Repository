package com.proje.DBConnection;

public class DBConnection {
	
	private String url;
	private String userName;
	private String password;
	
	
	public void volidation() {
		
		if(this.password==null) {
			
			System.out.println("Password de�erlerden biri eksik yada hatal�");
			
			throw new NullPointerException("!!!!!!!!!!!!---VER� BA�LANTISI BA�ARISIZ---!!!!!!!!!");
			
		}
		else if(this.url==null) {
			
			System.out.println("url de�erlerden biri eksik yada hatal�");
			
			throw new NullPointerException("!!!!!!!!!!!!---VER� BA�LANTISI BA�ARISIZ---!!!!!!!!!");
			
		}
		else if(this.userName==null) {
			
			System.out.println("userName de�erlerden biri eksik yada hatal�");
			
			throw new NullPointerException("!!!!!!!!!!!!---VER� BA�LANTISI BA�ARISIZ---!!!!!!!!!");
			
		}
		else {
			System.out.println("ba�lant� ba�ar�l� bir �ekilde ger�ekler�tirildi");
		}
		
	}
	public void openConnection() {
		System.out.println("URL: "+this.url);
		System.out.println("USERNAME: "+this.userName);
		System.out.println("PASWORD: "+this.password);
		System.out.println("ba�lat� ba�ar�l�");
		
	}
	public void closeConnection() {
		System.out.println("Ba�lant� kapat�ld�");
		
	}
	
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	public DBConnection(String url, String userName, String password) {
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
		return "DBConnection [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
