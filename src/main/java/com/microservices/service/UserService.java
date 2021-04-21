package com.microservices.service;

import org.springframework.stereotype.Service;

import com.microservices.model.User;

@Service("myService")
public class UserService {
	
	public User getUser() {
		return new User(1, "Carlos", "Camacho");
	}
}
