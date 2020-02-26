package org.jboss.tools.examples.controller;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.jboss.tools.examples.data.UserRepository;
import org.jboss.tools.examples.model.UserModel;

@Path("/user")
public class Controller {
	UserModel model = new UserModel();
	
	@PUT
	@Path("/login")
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public UserModel login(@FormParam("email") String email, @FormParam("password") String password) {
		UserRepository userRepository = new UserRepository();
		model = userRepository.getDataByEmailPassword(email, password);
		
		return model;
	}	

	@javax.ws.rs.Produces(MediaType.TEXT_PLAIN)
	@GET
	@Path("gotIt")
	public String returnSomething() {
		return "got it";
	}
	
	@Path("/test")
	@POST
	@javax.ws.rs.Produces(MediaType.TEXT_PLAIN)
	public String getData(@FormParam("name")String name) {
		return name;
	}
}
