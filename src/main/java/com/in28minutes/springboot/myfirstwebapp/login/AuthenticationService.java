package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("hwidae");
		boolean isValidPassword = password.equalsIgnoreCase("asdasd");
		
		return isValidUserName && isValidPassword;
	}

}
