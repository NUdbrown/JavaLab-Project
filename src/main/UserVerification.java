package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UserVerification {

	HashMap<UserLogin, Long>  userIDMap;
	Set<Long> usedIDs;
	
	public UserVerification()
	{
		userIDMap = new HashMap<UserLogin, Long>();
		usedIDs = new HashSet<Long>();
	}
	
	public Long FindID(UserLogin login)
	{
		return userIDMap.get(login);
	}
	
	public void CreateNewLogin(String userName, String password)
	{
		for (long i = 0; i < Integer.MAX_VALUE-1; i++) {
			
			if(usedIDs.contains(new Long(i)))
			{
				
			}
			else
			{
				usedIDs.add(i);
				userIDMap.put(new UserLogin(userName, password), i);
				i = Integer.MAX_VALUE;
			}

		}
		
	}
	
	public void SaveAllLogins(String fileLocation) throws IOException
	{
		FileOutputStream fos;
		
		ObjectOutputStream oos;
		
		
		if(userIDMap.keySet().isEmpty())
		{
			
		}
		else
		{
			for (UserLogin login : userIDMap.keySet() ) {
				
				Long userID = userIDMap.get(login);
				if(userID!= null)
				{
					
					File file = new File(fileLocation + "/" + userID);
					file.setWritable(true);
					file.setReadable(true);
					file.createNewFile();
					
					fos = new FileOutputStream(fileLocation + "/" + userID);
					
					oos = new ObjectOutputStream(fos);
					oos.writeObject(login);
				}
			}
		}
		
	}
	
	public void SaveLogin(UserLogin login, String fileLocation) throws IOException
	{
		
		Long userID = userIDMap.get(login);
		
		File file = new File(fileLocation + "/" + userIDMap.get(userID));
		file.setWritable(true);
		file.setReadable(true);
		file.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(file);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		if(userIDMap.get(login) != null)
		{
			oos.writeObject(login);
		}
		
		
		
		fos.close();
		oos.close();
	}
	
	public void SaveIDs(String fileLocation) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(fileLocation);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(usedIDs);
		
		
		fos.close();
		oos.close();
	}
	
	public void LoadAllLogins(String fileLocation) throws IOException, ClassNotFoundException
	{
		// get all ID's
		LoadIDs(fileLocation+"/ids");
				
		FileInputStream fis;
				
		ObjectInputStream ois;
				
				
		for (Long id : usedIDs ) {
			if(userIDMap.get(id) == null)
			{
				fis = new FileInputStream(fileLocation + "/" + id);
						
				ois = new ObjectInputStream(fis);
						
				UserLogin login = (UserLogin)ois.readObject();
						
				userIDMap.put(login,  id);
			}
		}		
	}
	public void LoadIDs(String fileLocation) throws ClassNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream(fileLocation);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		usedIDs = (Set<Long>) ois.readObject();
		
		
		fis.close();
		ois.close();
	}

}
