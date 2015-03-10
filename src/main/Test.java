package main;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		UserLogin[] userLogins = new UserLogin[5];
		UserVerification verification = new UserVerification();
		
		UserLogin userLogin1 = new UserLogin("testName1", "testPassword1");
		userLogins[0] = userLogin1;
		
		UserLogin userLogin2 = new UserLogin("testName2", "testPassword2");
		userLogins[1] = userLogin2;
		
		UserLogin userLogin3 = new UserLogin("testName3", "testPassword3");
		userLogins[2] = userLogin3;
		
		UserLogin userLogin4 = new UserLogin("testName4", "testPassword4");
		userLogins[3] = userLogin4;
		
		UserLogin userLogin5 = new UserLogin("testName5", "testPassword5");
		userLogins[4] = userLogin5;
		
		
		for (int i = 0; i < userLogins.length; i++) {
			verification.CreateNewLogin(userLogins[i].userName, userLogins[i].userPassword);
		}
		
		
		
		verification.SaveAllLogins("C:/Users/Benjamin Lofgreen/Desktop/test");
		
		verification.SaveIDs("C:/Users/Benjamin Lofgreen/Desktop/test");
		
		UserVerification verification2 = new UserVerification();
		verification2.LoadAllLogins("C:/Users/Benjamin Lofgreen/Desktop/test");
		
		for(UserLogin ul : verification2.userIDMap.keySet())
		{
			System.out.println("Name: " + ul.userName);
			System.out.println("Password: " + ul.userPassword);

			System.out.println();
		}
	}
}
