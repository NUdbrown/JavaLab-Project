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

public class RecipeData {
	
	public HashMap<Long, Recipe> recipeMap;
	private Set<Long> usedIDs;
	
	
	
	public RecipeData()
	{
		recipeMap = new HashMap<Long, Recipe>();
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
	
	public void SaveRecipe(long ID, String fileLocation) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(fileLocation + "/" + ID);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		if(recipeMap.get(ID) != null)
		{
			oos.writeObject(recipeMap.get(ID));
		}
		
		
		
		fos.close();
		oos.close();
		
	}
	
	public void SaveAllRecipes(String fileLocation) throws IOException
	{
		
		FileOutputStream fos;
		
		ObjectOutputStream oos;
		
		
		
		for (Long l : recipeMap.keySet() ) {
			if(recipeMap.get(l) != null)
			{
				File file = new File(fileLocation + "/" + l);
				file.setWritable(true);
				file.setReadable(true);
				file.createNewFile();
				fos = new FileOutputStream(fileLocation + "/" + l);
				
				oos = new ObjectOutputStream(fos);
				oos.writeObject(recipeMap.get(l));
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
	
	
	public void LoadRecipe(String fileLocation, long ID) throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(fileLocation + "/" + ID);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		recipeMap.put(ID, (Recipe) ois.readObject());
		
		fis.close();
		ois.close();
	}
	
	public void LoadAllRecipes(String fileLocation) throws ClassNotFoundException, IOException
	{
		// get all ID's
		LoadIDs(fileLocation);
		
		FileInputStream fis;
		
		ObjectInputStream ois;
		
		
		for (Long l : usedIDs ) {
			if(recipeMap.get(l) == null)
			{
				fis = new FileInputStream(fileLocation + "/" + l);
				
				ois = new ObjectInputStream(fis);
				
				Recipe o = (Recipe)ois.readObject();
				
				recipeMap.put(l,  o);
			}
		}
	}
	
	public void AddRecipe(long id, Recipe recipe)
	{
		if(!usedIDs.contains(new Long(id)))
		{
			usedIDs.add(new Long(id));
			recipeMap.put(new Long(id), recipe);
		}
	}
	
	public void RemoveRecipe(long id)
	{
		if(usedIDs.contains(new Long(id)))
		{
			usedIDs.remove(new Long(id));
			recipeMap.remove(new Long(id));
		}
	}
}
