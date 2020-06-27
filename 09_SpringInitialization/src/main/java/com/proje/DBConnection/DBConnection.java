package com.proje.DBConnection;

public class DBConnection {
	
	private String url;
	private String userName;
	private String password;
	
	
	public void volidation() {
		
		if(this.password==null) {
			
			System.out.println("Password degerlerden biri eksik yada hatali");
			
			throw new NullPointerException("!!!!!!!!!!!!---VERi BAgLANTiSi BAsARiSiZ---!!!!!!!!!");
			
		}
		else if(this.url==null) {
			
			System.out.println("url degerlerden biri eksik yada hatali");
			
			throw new NullPointerException("!!!!!!!!!!!!---VERi BAgLANTiSi BAsARiSiZ---!!!!!!!!!");
			
		}
		else if(this.userName==null) {
			
			System.out.println("userName degerlerden biri eksik yada hatali");
			
			throw new NullPointerException("!!!!!!!!!!!!---VERi BAgLANTiSi BAsARiSiZ---!!!!!!!!!");
			
		}
		else {
			System.out.println("baglanti basarili bir sekilde gerceklerstirildi");
		}
		
	}
	public void openConnection() {
		System.out.println("URL: "+this.url);
		System.out.println("USERNAME: "+this.userName);
		System.out.println("PASWORD: "+this.password);
		System.out.println("baglati basarili");
		
	}
	public void closeConnection() {
		System.out.println("Baglanti kapatildi");
		
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
