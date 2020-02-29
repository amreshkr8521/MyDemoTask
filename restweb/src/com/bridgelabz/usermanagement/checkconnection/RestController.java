package com.bridgelabz.usermanagement.checkconnection;

import java.sql.Connection;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.logging.Logger;

import com.bridgelabz.usermanagement.businesslogic.UserStatelessRemote;
import com.bridgelabz.usermanagement.model.UserBeans;

@Path("connection")
public class RestController {
	
	Logger log = Logger.getLogger(RestController.class);
	
	@EJB
	UserStatelessRemote ejbUser;
	

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("database")
	public String connection() {

		try {
			Connection con = ejbUser.getConnection();
//			con.close();
			return "connection successful";
		} catch (Exception e) {

			e.printStackTrace();
			return "no connection";
		}
		
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("data")
	public String produceData() {
		log.info("Hitting produceData");
		return ejbUser.getUser();
		
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("user/{fname}")
	public void AddUser(@PathParam("fname") String fname) {
		
	}
	
	@POST
	@Path("ADD")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void addUser(UserBeans beans ) {
	
		ejbUser.addUser(beans);
		
	}
	
	@POST
	@Path("demo")
	@Produces(MediaType.APPLICATION_JSON)
	public String demo(String data) {
		return data;
	}

}
