package com.login.userlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.userlogin.model.UserLogin;

@Repository
public interface LoginRepository extends JpaRepository<UserLogin, Integer>{
	
	public UserLogin findByUserNameAndPassword(String userName, String password);

}
