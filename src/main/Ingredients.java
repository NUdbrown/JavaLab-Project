package main;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

public class Ingredients implements Serializable {

	
	public HashMap<String, Long> ingredients;
	public long id;
	
	
	public Ingredients(long id)
	{
		ingredients = new HashMap<String, Long>();
		this.id = id;
		
	}
	
	public void AddIngredient(String ingredient)
	{
		if(ingredients.containsKey(ingredient))
		{
			Long amount = ingredients.get(ingredient);
			amount++;
			ingredients.put(ingredient, amount);
			
		}
		else
		{
			ingredients.put(ingredient, new Long(1));
		}
		
		
	}
	
	public void AddIngredients(String ingredient, long amountToAdd)
	{
		if(ingredients.containsKey(ingredient))
		{
			Long amount = ingredients.get(ingredient);
			amount += amountToAdd;
			ingredients.put(ingredient, amount);
			
		}
		else
		{
			ingredients.put(ingredient, new Long(amountToAdd));
		}
		
		
	}
	
	public void RemoveIngredient(String ingredient)
	{
		if(ingredients.containsKey(ingredient))
		{
			Long amount = ingredients.get(ingredient);
			amount--;
			ingredients.put(ingredient, amount);
			
		}

		
		
	}
	
	public void RemoveIngredients(String ingredient, long amountToRemove)
	{
		if(ingredients.containsKey(ingredient))
		{
			Long amount = ingredients.get(ingredient);
			amount -= amountToRemove;
			ingredients.put(ingredient, amount);
			
		}
		
		
		
	}
	
	public long GetIngredientAmount(String ingredient)
	{
		return ingredients.get(ingredient);
	}
	
	public Set<String> GetIngredientList()
	{
		return ingredients.keySet();
	}
	

}
