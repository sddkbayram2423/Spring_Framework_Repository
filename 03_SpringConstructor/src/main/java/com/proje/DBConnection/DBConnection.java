package com.proje.DBConnection;

public class DBConnection {
	
	private String url;
	private String username;
	private String password;
	
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	public void openConnection() {
		System.out.println("Url: "+this.url);
		System.out.println("userName: "+this.username);
		System.out.println("Password: "+this.password);
		System.out.println("Baðlanti açildi");
	}public void closeConnection() {
	
		System.out.println("Baðlanti kapandi");
	}

	public DBConnection(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public DBConnection(String url, String username) {
		super();
		this.url = url;
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
