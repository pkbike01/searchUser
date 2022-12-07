package com.searchUsers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchUsers.dto.User;

@Controller
public class UserController {
	
	
	@RequestMapping("/searchPage")
	public String viewSearchPage() {
		return "userSearch";
	}
	
	@RequestMapping("/searchUser")
	public String searchUser(@RequestParam("id") long id, Model model) {
		UserRestClient client = new UserRestClient();
		User user = client.getUserById(id);
		
		model.addAttribute("user",user);
		return "user_result";
		
	}
	
	

}
