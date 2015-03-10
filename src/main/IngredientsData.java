package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IngredientsData {
	
	public HashMap<Long, Ingredients> ingredientsMap;
	private Set<Long> usedIDs;
	
	
	
	public IngredientsData()
	{
		ingredientsMap = new HashMap<Long, Ingredients>();
		usedIDs = new HashSet<Long>();
	}
	
	
	public void SaveIDs(String fileLocation) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(fileLocation+"/ids");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(usedIDs);
		
		
		fos.close();
		oos.close();
	}
	
	public void SaveIngredients(long ID, String fileLocation) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(fileLocation + "/" + ID);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		if(ingredientsMap.get(ID) != null)
		{
			oos.writeObject(ingredientsMap.get(ID));
		}
		
		
		
		fos.close();
		oos.close();
		
	}
	
	public void SaveAllIngredients(String fileLocation) throws IOException
	{
		
		FileOutputStream fos;
		
		ObjectOutputStream oos;
		
		
		
		for (Long l : ingredientsMap.keySet() ) {
			if(ingredientsMap.get(l) != null)
			{
				File file = new File(fileLocation + "/" + l);
				file.setWritable(true);
				file.setReadable(true);
				file.createNewFile();
				fos = new FileOutputStream(fileLocation + "/" + l);
				
				oos = new ObjectOutputStream(fos);
				oos.writeObject(ingredientsMap.get(l));
			}
		}
	}
	
	
	public void LoadIDs(String fileLocation) throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(fileLocation+"/ids");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		usedIDs = (Set<Long>) ois.readObject();
		
		
		fis.close();
		ois.close();
	}
	
	
	public void LoadIngredients(String fileLocation, long ID) throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(fileLocation + "/" + ID);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ingredientsMap.put(ID, (Ingredients) ois.readObject());
		
		fis.close();
		ois.close();
	}
	
	public void LoadAllIngredients(String fileLocation) throws ClassNotFoundException, IOException
	{
		// get all ID's
		LoadIDs(fileLocation);
		
		FileInputStream fis;
		
		ObjectInputStream ois;
		
		
		for (Long l : usedIDs ) {
			if(ingredientsMap.get(l) == null)
			{
				fis = new FileInputStream(fileLocation + "/" + l);
				
				ois = new ObjectInputStream(fis);
				
				Ingredients o = (Ingredients)ois.readObject();
				
				ingredientsMap.put(l,  o);
			}
		}
	}
	
	public void AddIngredients(long id, Ingredients ingredients)
	{
		
		if(!usedIDs.contains(new Long(id)))
		{
			usedIDs.add(new Long(id));
			ingredientsMap.put(new Long(id), ingredients);
		}
	}
	
	public void RemoveIngredients(long id)
	{
		if(usedIDs.contains(new Long(id)))
		{
			usedIDs.remove(new Long(id));
			ingredientsMap.remove(new Long(id));
		}
	}
}
