package com.example.action;

import com.example.model.User;

public class LoginAction {
	private String username;
	private String city;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String execute() {
		if (username.equals("Basava"))
			return "success";
		return "error";
	}
}
