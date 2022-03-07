package com.login.userlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.userlogin.model.UserLogin;
import com.login.userlogin.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;

	public UserLogin autheticateUser(String userName, String password) {

		UserLogin userLogin = loginRepository.findByUserNameAndPassword(userName, password);
		return userLogin;
	}

}
