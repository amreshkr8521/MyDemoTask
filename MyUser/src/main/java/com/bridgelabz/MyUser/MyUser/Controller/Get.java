package com.bridgelabz.MyUser.MyUser.Controller;

import java.util.ArrayList;
import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bridgelabz.MyUser.MyUser.UserModel;

@Path("get")

public class Get {
	
	@GET
	@Path("getMore")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<UserModel> data() {
		UserModel model=new UserModel();
		model.setFname("Amresh");
		model.setAge("23");
		model.setCity("Ranchi");
		model.setGender("male");
		model.setLnmae("Kumar");
		model.setMobile("7987668236");
		model.setState("Jharkhand");
		model.setUser("admin");
		List<UserModel> list=new ArrayList<UserModel>();
		list.add(model);
		return list;
	}
}
