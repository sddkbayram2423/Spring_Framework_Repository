package com.proje.database;

public class DataBase {
	
	private String url;
	private String username;
	private String pasword;
	

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
	@Override
	public String toString() {
		return "DataBase [url=" + url + ", username=" + username + ", pasword=" + pasword + "]";
	}
	
	

}
