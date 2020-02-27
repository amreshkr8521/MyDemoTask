package org.jboss.tools.examples.service;

import javax.ejb.Remote;

import org.jboss.tools.examples.model.UserModel;
@Remote
public interface restapi {
	
	public void getdata();
	public UserModel login(String username,String password);
	public void updateUser(UserModel object);
	public void deleteUser(UserModel object);
}
