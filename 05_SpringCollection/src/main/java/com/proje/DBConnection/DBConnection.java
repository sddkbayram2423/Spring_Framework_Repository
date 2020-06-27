package com.proje.DBConnection;

import java.util.List;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DBConnection {
	
	private String username;
	private String password;
	
	private Map<String,String> maps;
	private List<String> list;
	private Properties props;
	
	public void openConnection() {
		
		System.out.println("username: "+this.username);
		System.out.println("password: "+this.password);
		System.out.println("Baglanti açildi");
		
		System.out.println("List Özellikleri");
		for(String özellikler:list) {
			System.out.println("\t"+özellikler);
		}
		System.out.println("Properties Özellikler");
		Set<String> keys=this.maps.keySet();
		
		for(String key:keys) {
			System.out.println("\t"+key+":"+this.maps.get(key));
		}
		System.out.println("Properties içindekiler");
		Set<String> keyProps=this.props.stringPropertyNames();
		
		for(String a:keyProps) {
			
			System.out.println("\t"+a +": "+props.getProperty(a));
			
		}
		
	}
	public void closeConnection() {
		System.out.println("baglanti kapandi");
		
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
	public Map<String, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	
	
	

}
