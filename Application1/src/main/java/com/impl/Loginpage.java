package com.impl;

import java.util.ResourceBundle;

public class Loginpage {
	
	public int login(String uname,String password)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String username=rb.getString("username");
		String pass=rb.getString("password");
		if(username.equals(uname)&&pass.equals(password))
		{
			return 1;
		}
		return 0;
	}

}
