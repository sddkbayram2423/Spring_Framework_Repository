package com.proje.DBConnection;

public class DBConnection {
	
	private String url;
	private String userName;
	private String password;
	
	
	public void volidation() {
		
		if(this.password==null) {
			
			System.out.println("Password deðerlerden biri eksik yada hatalý");
			
			throw new NullPointerException("!!!!!!!!!!!!---VERÝ BAÐLANTISI BAÞARISIZ---!!!!!!!!!");
			
		}
		else if(this.url==null) {
			
			System.out.println("url deðerlerden biri eksik yada hatalý");
			
			throw new NullPointerException("!!!!!!!!!!!!---VERÝ BAÐLANTISI BAÞARISIZ---!!!!!!!!!");
			
		}
		else if(this.userName==null) {
			
			System.out.println("userName deðerlerden biri eksik yada hatalý");
			
			throw new NullPointerException("!!!!!!!!!!!!---VERÝ BAÐLANTISI BAÞARISIZ---!!!!!!!!!");
			
		}
		else {
			System.out.println("baðlantý baþarýlý bir þekilde gerçeklerþtirildi");
		}
		
	}
	public void openConnection() {
		System.out.println("URL: "+this.url);
		System.out.println("USERNAME: "+this.userName);
		System.out.println("PASWORD: "+this.password);
		System.out.println("baðlatý baþarýlý");
		
	}
	public void closeConnection() {
		System.out.println("Baðlantý kapatýldý");
		
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
