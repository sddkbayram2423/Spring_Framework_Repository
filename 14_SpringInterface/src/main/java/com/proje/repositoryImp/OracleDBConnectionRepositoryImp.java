package com.proje.repositoryImp;

import com.proje.repository.DBConnectionRepository;

public class OracleDBConnectionRepositoryImp implements DBConnectionRepository{

	@Override
	public void openConnection() {
		System.out.println("Oracle Connection acildi");
		
	}

	@Override
	public void closeConnetion() {
		System.out.println("Oracle Connection kapandi");
	}

}
