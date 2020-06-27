package com.proje.database;

import java.util.List;

public class DataBase {

	private String url;
	private String username;
	private String pasword;
	private List<String> �zellikler;

	public DataBase() {
		// TODO Auto-generated constructor stub
	}
	

	public DataBase(String url, String username, String pasword, List<String> �zellikler) {
		super();
		this.url = url;
		this.username = username;
		this.pasword = pasword;
		this.�zellikler = �zellikler;
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

	public List<String> get�zellikler() {
		return �zellikler;
	}

	public void set�zellikler(List<String> �zellikler) {
		this.�zellikler = �zellikler;
	}


	@Override
	public String toString() {
		return "DataBase [url=" + url + ", username=" + username + ", pasword=" + pasword + "\n �zellikler=" + �zellikler
				+ "]";
	}

}
