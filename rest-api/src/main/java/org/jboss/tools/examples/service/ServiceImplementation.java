package org.jboss.tools.examples.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import org.jboss.tools.examples.data.DatabaseConnection;
import org.jboss.tools.examples.model.UserModel;

public class ServiceImplementation implements restapi {
	DatabaseConnection con = new DatabaseConnection();
	UserModel object = new UserModel();
	
	
	@Override
	public void getdata() {
		Connection connection = con.jdbcConnection();
		String qry = "select * from restapiUsers ;";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				object.setFname(rs.getString(2));
				object.setLname(rs.getString(3));
				object.setEmail(rs.getString(4));
				object.setAge(rs.getInt(5));
				object.setGender(rs.getString(6));
				object.setAuthorization(rs.getString(7));
				object.setMobile(rs.getLong(8));
				object.setLocation(rs.getString(11));
				object.setMname(rs.getString(12));
				object.setUsername(rs.getString(13));
				object.setCountry(rs.getString(14));
				object.setDob(rs.getString(15));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserModel login(String username, String password) {
		Connection connection = con.jdbcConnection();
		String qry = "select * from restapiUsers where userName='" + username + " and password='" + password + ";";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				object.setFname(rs.getString(2));
				object.setLname(rs.getString(3));
				object.setEmail(rs.getString(4));
				object.setAge(rs.getInt(5));
				object.setGender(rs.getString(6));
				object.setAuthorization(rs.getString(7));
				object.setMobile(rs.getLong(8));
				object.setLocation(rs.getString(11));
				object.setMname(rs.getString(12));
				object.setUsername(rs.getString(13));
				object.setCountry(rs.getString(14));
				object.setDob(rs.getString(15));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return object;
	}

	@Override
	public void updateUser(UserModel object) {
		Connection connection = con.jdbcConnection();
		String qry = "update restapiUsers SET fname='" + object.getFname() + "' lname='" + object.getLname()
				+ "' mname='" + object.getFname() + "' email='" + object.getEmail() + "' age='" + object.getAge()
				+ "' gender='" + object.getGender() + "' user='" + object.getAuthorization() + "' mobile='"
				+ object.getMobile() + "' location='" + object.getLocation() + "' countary='" + object.getCountry()
				+ "' dob='" + object.getDob() + "where userName='" + object.getUsername() + "';";
		PreparedStatement preparestatement;
		try {
			preparestatement = connection.prepareStatement(qry);
			int updatedRow = preparestatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(UserModel object) {
		Connection connection = con.jdbcConnection();
		String qry = "delete from restapiUsers where userName='" + object.getUsername() + "';";
		PreparedStatement preparestatement;
		try {
			preparestatement = connection.prepareStatement(qry);
			int rowcount = preparestatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void registration(UserModel modelobject) {
		Connection connection =con.jdbcConnection();
		String qry="insert into restapiUsers (fname,mname,lname,age,locatin,email,gender,user,userName,country,dob,mobile) "
				+ "values('"+object.getFname()+"','"+object.getMname()+"','"+object.getLname()+"','"+object.getAge()+"','"+object.getLocation()+"','"+object.getEmail()+"','"+object.getGender()+"','"+object.getAuthorization()+"','"+object.getUsername()+"','"+object.getCountry();
	}
}
