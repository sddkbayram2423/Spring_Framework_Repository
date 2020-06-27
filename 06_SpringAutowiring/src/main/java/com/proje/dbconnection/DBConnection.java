package com.proje.dbconnection;

import org.springframework.beans.factory.annotation.Autowired;

import com.proje.data.Data;
import com.proje.database.DataBase;

public class DBConnection {
	@Autowired
	private Data data;
	@Autowired
	private DataBase dataBase;
	
	public void openConnection() {
		System.out.println("jdnd");
		System.out.println("url: "+this.dataBase.getUrl());
		System.out.println("username: "+this.dataBase.getUsername());
		System.out.println("pasword: "+this.dataBase.getPasword());
		
		
		System.out.println("-----------------------------------");
		System.out.println("data1: "+data.getData1());
		System.out.println("data2: "+data.getData2());
		System.out.println("baglanti açildi");
		
	}
	public void closeConnection() {
		
		System.out.println("baglanti kapandi");
		
	}
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	public DBConnection(Data data, DataBase dataBase) {
		super();
		this.data = data;
		this.dataBase = dataBase;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public DataBase getDataBase() {
		return dataBase;
	}
	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}
	

}
