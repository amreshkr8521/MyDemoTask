package com.bridgelabz.usermanagement.businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.bridgelabz.usermanagement.model.UserBeans;
import com.bridgelabz.usermanagemnet.repository.DatabaseConnectivityRemote;

@Stateless
public class UserStateless implements UserStatelessRemote {
	
	@EJB
	DatabaseConnectivityRemote remoteDatabase;
	private UserBeans beans;

	List<UserBeans> list;
	
	public UserStateless() {

	}

	@Override
	public String getUser() {
		
		return "data found";
	}

	@Override
	public Connection getConnection() {
		return remoteDatabase.jdbcConnection();
	}

	public UserBeans getBeans() {
		return beans;
	}

	public void setBeans(UserBeans beans) {
		this.beans = beans;
	}
	
	@Override
	public void addUser(UserBeans user) {
		list = new ArrayList<UserBeans>();
		Connection connection=getConnection();
		String query="INSERT INTO restapiUsers (fname,lname,mname,email,age,gender,user,mobile,location,userName,country,dob) VALUES('"+user.getfName()+"','"+user.getmName()+"','"+user.getlName()+"','"+user.getGmail()+"','"+user.getAge()+"','"+user.getGender()+"','"+user.getUser()+"','"+user.getMobile()+"','"+user.getLocation()+"','"+user.getUsername()+"','"+user.getCountry()+",',"+user.getDob()+"'); ";
		PreparedStatement preparestatement;
		try {
			preparestatement = connection.prepareStatement(query);
			preparestatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("database showing error please check");
			e.printStackTrace();
		}
		list.add(user);
	}

	
}
