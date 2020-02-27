package org.jboss.tools.examples.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.tools.examples.model.UserModel;
import org.jboss.tools.examples.service.restapi;

@Path("Login")
public class Login {
	@EJB
	restapi restobject;
	/**
	 * to make the user Sign In
	 * 
	 * @param username String
	 * @param password String
	 * @return UserModel
	 */
	@Path("signIn")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel signIn(String username, String password) {
		UserModel userObject = restobject.login(username, password);
		if (userObject == null)
			System.out.println("not a valid user");
		else
			return userObject;
		return userObject;
	}
	/**
	 * to check if the user is admin or not.
	 * 
	 * @param modelObject UserModel
	 * @return boolean
	 */
	public boolean isAdmin(UserModel modelObject) {
		if (modelObject.getAuthorization().equals("admin"))
			return true;
		else
			return false;
	}
	
	
}
