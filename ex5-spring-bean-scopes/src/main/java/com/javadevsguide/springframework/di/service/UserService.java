package com.javadevsguide.springframework.di.service;

public class UserService {
	
	private String name = "DefaultName";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
