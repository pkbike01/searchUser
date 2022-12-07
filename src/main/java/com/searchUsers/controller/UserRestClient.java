package com.searchUsers.controller;

import org.springframework.web.client.RestTemplate;

import com.searchUsers.dto.User;

public class UserRestClient {

	public User getUserById(long id) {
		RestTemplate rest = new RestTemplate();
		User user = rest.getForObject("http://localhost:8080/api/user/"+id,User.class );
		
		return user;
	}

}
