package com.springboot.todolist.login;

import org.springframework.stereotype.Service;

@Service
public class Authentication {
	
	public boolean checkCredentials(String user, String password) {
		
		boolean isvaliduser = user.equalsIgnoreCase("sk");
		boolean isvalidpassword = password.equalsIgnoreCase("pass");
		
		return (isvaliduser && isvalidpassword) ;
		
	}

}
