package com.bridgelabz.MyUser.MyUser;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserModel {
	private String fname;
	private String lnmae;
	private String gender;
	private String state;
	private String city;
	private String mobile;
	private String age;
	private String user;
	public UserModel(String fname, String lnmae, String gender, String state, String city, String mobile, String age,
			String user) {
		this.fname = fname;
		this.lnmae = lnmae;
		this.gender = gender;
		this.state = state;
		this.city = city;
		this.mobile = mobile;
		this.age = age;
		this.user = user;
	}
	public UserModel() {}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLnmae() {
		return lnmae;
	}
	public void setLnmae(String lnmae) {
		this.lnmae = lnmae;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
