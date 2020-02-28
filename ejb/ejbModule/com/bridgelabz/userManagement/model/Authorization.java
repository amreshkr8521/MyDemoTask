package com.bridgelabz.userManagement.model;

import javax.persistence.Entity;

@Entity
public class Authorization {

	private String dashboard;
	private String settings;
	private String usersInformation;
	private String WebPageOne;
	private String WebPagetwo;
	private String WebPageThree;

	public Authorization() {
		super();
	}

	public String getDashboard() {
		return dashboard;
	}

	public void setDashboard(String dashboard) {
		this.dashboard = dashboard;
	}

	public String getSettings() {
		return settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

	public String getUsersInformation() {
		return usersInformation;
	}

	public void setUsersInformation(String usersInformation) {
		this.usersInformation = usersInformation;
	}

	public String getWebPageOne() {
		return WebPageOne;
	}

	public void setWebPageOne(String webPageOne) {
		WebPageOne = webPageOne;
	}

	public String getWebPagetwo() {
		return WebPagetwo;
	}

	public void setWebPagetwo(String webPagetwo) {
		WebPagetwo = webPagetwo;
	}

	public String getWebPageThree() {
		return WebPageThree;
	}

	public void setWebPageThree(String webPageThree) {
		WebPageThree = webPageThree;
	}
}
