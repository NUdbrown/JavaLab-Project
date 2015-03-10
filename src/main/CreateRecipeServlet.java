package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateRecipeServlet
 */
@WebServlet("/Recipe/Recipe")
public class CreateRecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RecipeData recipeData;
	
	String storageFileLocation = "C:/Users/Zach OSullivan/Desktop/Recipes";
	
    public CreateRecipeServlet(String storageFileLocation) {
        super();
        
        recipeData = new RecipeData();
        
        this.storageFileLocation = storageFileLocation;
        
        try {
        	recipeData.LoadIDs(storageFileLocation+"/recipes/ids");
        	recipeData.LoadAllRecipes(storageFileLocation+"/recipes");

		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    

		try {
			recipeData.LoadIDs(storageFileLocation+"/recipes/ids");
			recipeData.LoadAllRecipes(storageFileLocation+"/recipes");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatus(500);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/500InternalServerError.jsp");
			rd.forward(request, response);	
		}
    	
		Recipe recipe = recipeData.recipeMap.get(new Long(request.getParameter("id")));
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/RecipePage");
		rd.forward(request, response);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		try {
			recipeData.LoadIDs(storageFileLocation+"/recipes/ids");
			recipeData.LoadAllRecipes(storageFileLocation+"/recipes");
			
			String[] ingredientsString = request.getParameter("ingredients").split(",");
			
			
			String title = request.getParameter("title");
			String description = request.getParameter("description");
			
			Recipe recipe = new Recipe();
			Ingredients ingredients = new Ingredients(-1);
			
			for(String s : ingredientsString)
			{
				ingredients.AddIngredient(s);
			}
			
			for(long l = 0; l < Long.MAX_VALUE-1; l++)
			{
				if(!recipeData.recipeMap.containsKey(l))
				{
					recipe.ingredientsID = l;
					ingredients.id = l;
				}
			}
			
			recipe.recipeName = title;
			recipe.ingredients = ingredients;
			recipe.recipeDescription = description;
			
			
			for(long l = 0; l < Long.MAX_VALUE-1; l++)
			{
				if(!recipeData.recipeMap.containsKey(l))
				{
					
					recipeData.AddRecipe(l, recipe);
				}
			}
			
			
			recipeData.SaveIDs(storageFileLocation+"/recipes/ids");
			recipeData.SaveAllRecipes(storageFileLocation+"/recipes");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatus(500);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/500InternalServerError.jsp");
			rd.forward(request, response);	
		}
		
		

		
		
	}

}
