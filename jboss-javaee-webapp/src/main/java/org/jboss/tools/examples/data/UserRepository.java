package org.jboss.tools.examples.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.jboss.tools.examples.model.UserModel;

public class UserRepository {
	JDBCConnection jdbcConnection = new JDBCConnection();
	UserModel modelObject = new UserModel();

	public UserModel getDataByEmailPassword(String userName, String password) {
//		Connection connection=jdbcConnection.jdbcConnection();
//		System.out.println("got it");
//		String query="SELECT * FROM customer WHERE email='"+email+"', and password='"+password+"';";
//		ResultSet resultSet=null;
//		try {
//			PreparedStatement prepareStatement=connection.prepareStatement(query);
//			 resultSet=prepareStatement.executeQuery();
//			 resultSet.next();
////			 modelObject.setAddress(resultSet.getString(9));
////			 modelObject.setAge(resultSet.getInt(7));
////			 modelObject.setCity(resultSet.getString(3));
////			 modelObject.setEmail(resultSet.getString(4));
//			 modelObject.setFname(resultSet.getString(2));
////			 modelObject.setGender(resultSet.getString(6));
////			 modelObject.setId(resultSet.getLong(7));
////			 modelObject.setLname(resultSet.getString(3));
////			 modelObject.setPhoneNumber(resultSet.getString(5));
////			 modelObject.setRole(resultSet.getString(10));
////			 modelObject.setState(resultSet.getString(11));
//			 connection.close();
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		return modelObject;
//		
		System.out.println("got it***************************************************************");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connction = DriverManager.getConnection("jdbc:mysql://localhost:3306/restapi", "root", "12345");
			// String qry = "SELECT * FROM customer WHERE userName='" + username + "';";
			String qry = "Select * from restapiUsers where email='rahul@gmail.com';";

			PreparedStatement preparestatement = connction.prepareStatement(qry);
			preparestatement = connction.prepareStatement(qry);
			ResultSet resultSet = preparestatement.executeQuery(qry);

			while (resultSet.next()) {

				modelObject.setEmail(resultSet.getString(4));

				modelObject.setFname(resultSet.getString(2));
				modelObject.setLname(resultSet.getString(3));
				modelObject.setPhoneNumber(resultSet.getString(5));
				modelObject.setGender(resultSet.getString(6));

				modelObject.setAddress(resultSet.getString(9));

			}
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return modelObject;
	}

}
