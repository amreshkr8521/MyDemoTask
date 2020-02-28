package com.demo;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bridgelabz.userManagement.businessLgic.BusinessLogic;
import com.bridgelabz.userManagement.model.User;


@Path("user")
@Stateless
public class Controller {
	@EJB
	BusinessLogic businessLogic;

	public Controller() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getData() {
		return "hello";
	}

	@Path("addUser")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void addUser(@PathParam("fname") String fname, @PathParam("mname") String mname,
			@PathParam("lname") String lname, @PathParam("email") String email, @PathParam("gender") String gender,
			@PathParam("country") String country, @PathParam("address") String address,
			@PathParam("phoneNumber") long phoneNo, @PathParam("extraPhoneNo") long extraPhoneNo,
			@PathParam("user") String user, @PathParam("password") String password,
			@PathParam("userName") String userName, @PathParam("user") String userAutho) {

		User webUser = new User();
		webUser.setAddress(address);
		webUser.setCountry(country);
		webUser.setEmail(email);
		webUser.setExtraPhoneNo(extraPhoneNo);
		webUser.setFname(fname);
		webUser.setGender(gender);
		webUser.setMname(mname);
		webUser.setLname(lname);
		webUser.setPassword(password);
		webUser.setPhoneNo(extraPhoneNo);
		webUser.setUser(userAutho);
		webUser.setUserName(userName);
		businessLogic.addUser(webUser);
	}

	@Path("login")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_HTML)
	public User login(@PathParam("userName") String username, @PathParam("password") String password) {
		User user = businessLogic.login(username, password);
		if (user != null)
			return user;
		else
			return user;
	}
}
