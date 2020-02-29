package com.bridgelabz.usermanagemnet.repository;

import java.sql.Connection;

import javax.ejb.Remote;

@Remote
public interface DatabaseConnectivityRemote {
	public Connection jdbcConnection();
}
