package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IngredientServlet
 */
@WebServlet("/IngredientServlet")
public class RecipeSiteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String fileLocation;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipeSiteServlet(String fileLocation) {
        super();
        this.fileLocation = fileLocation;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userIDString = request.getParameter("userID");
		Long userID = new Long(userIDString);
		
		IngredientsData data = new IngredientsData();
		
		try {
			data.LoadIngredients(fileLocation, userID);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Ingredients userIngredients = data.ingredientsMap.get(userID);
		
		// Return Ingredients
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// Add Ingredient
		String ingredients = request.getParameter("ingredients");
		String userIDString = request.getParameter("userID");
		
		
		Long userID = new Long(userIDString);
		
		
		String[] ingredientsParsed = ingredients.split(", ");
		
		IngredientsData data = new IngredientsData();
		
		try {
			data.LoadIngredients(fileLocation, userID);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Ingredients userIngredients = data.ingredientsMap.get(userID);
		
		for(String s : ingredientsParsed)
		{
			
			userIngredients.AddIngredient(s);
			
		}
		
		
	}

}
