package com.bridgelabz.MyUser.MyUser;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("data")
public class GetData {

	@Path("User")
	@POST
	public void addUser(@FormParam("email") String email, @FormParam("FirstName") String fname,
			@FormParam("LastName") String lname, @FormParam("desigination") String desigination,
			@FormParam("gender") String gender, @FormParam("mobile") String mobile, @FormParam("state") String state,
			@FormParam("city") String city, @FormParam("address") String address, @FormParam("age") String age,
			@FormParam("district") String dist, @FormParam("password") String password) {

	}

	@Path("abc")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String test(String name) {
		String user = "Arun";
		return user;
	}

}
