package com.login.userlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.userlogin.model.UserLogin;
import com.login.userlogin.request.UserRequest;
import com.login.userlogin.service.LoginService;

@RestController
@RequestMapping({ "/api" })
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	@PostMapping(value = "/login", produces = "application/json")
	public UserLogin userLogin(@RequestBody UserRequest userRequest) {
		
		System.out.println("BEGIN ::: Inside userLogin method");
		
		return loginService.autheticateUser(userRequest.getUserName(),userRequest.getPassword());
		
	}

}
