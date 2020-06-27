package com.proje.repositoryImp;

import com.proje.repository.DBConnectionRepository;

public class MySqlDBConnectionRepositoryImp implements DBConnectionRepository {

	@Override
	public void openConnection() {
		System.out.println("MySql Connection acildi");
		
	}

	@Override
	public void closeConnetion() {
		System.out.println("MySql Connection kapandi");
		
	}

}
