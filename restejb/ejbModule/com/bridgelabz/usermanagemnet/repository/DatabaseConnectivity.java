package com.bridgelabz.usermanagemnet.repository;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class DatabaseConnectivity
 */
@Stateless
@LocalBean
public class DatabaseConnectivity implements DatabaseConnectivityRemote {

	@Override
	public Connection jdbcConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restapi", "root", "12345");
			return connection;

		} catch (Exception e) {
			System.out.println("connection failed");
			e.printStackTrace();
			return null;
		}
	}
}
