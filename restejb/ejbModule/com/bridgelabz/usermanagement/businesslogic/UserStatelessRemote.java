package com.bridgelabz.usermanagement.businesslogic;

import java.sql.Connection;

import javax.ejb.Remote;

import com.bridgelabz.usermanagement.model.UserBeans;

@Remote
public interface UserStatelessRemote {
	public String getUser();
	public Connection getConnection();
	void addUser(UserBeans user);
}
