package main;

import java.io.Serializable;

public class Recipe implements Serializable{

	public int ingredientsID;
	public String recipeDescription;
	public String recipeName;
	public Ingredients ingredients;

	public Recipe()
	{
		ingredientsID = -1;
		recipeDescription = "";
		recipeName = "";
		ingredients = null;
	}
}
