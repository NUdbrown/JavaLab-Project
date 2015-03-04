package main;

import java.io.Serializable;

public class UserLogin implements Serializable {

	public String userName;
	public String userPassword;
	
	public UserLogin(String name, String password)
	{
		this.userName = name;
		this.userPassword = password;
	}
	
	@Override
	public boolean equals(Object compare)
	{
		
		try
		{
			UserLogin loginCompare = (UserLogin) compare;
			
			if(loginCompare.userName.equals(userName) && loginCompare.userPassword.equals(userPassword))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return false;
		}
		

	}
}
