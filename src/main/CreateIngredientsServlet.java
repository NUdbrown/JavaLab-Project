package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateIngredientsServlet
 */
@WebServlet("/Recipe/Ingredients")
public class CreateIngredientsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IngredientsData ingredientsData;
	UserVerification verification;
	String storageFileLocation = "C:/Users/Zach OSullivan/Desktop/Recipes";
	
	
	
    public CreateIngredientsServlet(String storageFileLocation) {
        super();
        ingredientsData = new IngredientsData();
        verification = new UserVerification();
        this.storageFileLocation = storageFileLocation;
        
        try {
        	ingredientsData.LoadIDs(storageFileLocation+"/ingredients/ids");
        	ingredientsData.LoadAllIngredients(storageFileLocation+"/ingredients");
        	verification.LoadIDs(storageFileLocation+"/users/ids");
        	verification.LoadAllLogins(storageFileLocation+"/users/");

		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		try {
			ingredientsData.LoadIDs(storageFileLocation+"/ingredients/ids");
			ingredientsData.LoadAllIngredients(storageFileLocation+"/ingredients");
        	verification.LoadIDs(storageFileLocation+"/users/ids");
        	verification.LoadAllLogins(storageFileLocation+"/users/");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatus(500);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/500InternalServerError.jsp");
			rd.forward(request, response);	
		}
		
		UserLogin login = new UserLogin(request.getParameter("Email"), request.getParameter("SuperSecurePassword"));
		
		Ingredients ingredients = ingredientsData.ingredientsMap.get(verification.FindID(login));
		
		
		request.setAttribute("login", login);
		request.setAttribute("ingredients", ingredients);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/UserPage");
		rd.forward(request, response);
    	
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			ingredientsData.LoadIDs(storageFileLocation+"/ingredients/ids");
			ingredientsData.LoadAllIngredients(storageFileLocation+"/ingredients");
        	verification.LoadIDs(storageFileLocation+"/users/ids");
        	verification.LoadAllLogins(storageFileLocation+"/users/");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatus(500);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/500InternalServerError.jsp");
			rd.forward(request, response);	
		}
		
		String[] ingredientsString = request.getParameter("ingredients").split(",");
		UserLogin login = new UserLogin(request.getParameter("Email"), request.getParameter("SuperSecurePassword"));
		Ingredients ingredients = new Ingredients(verification.FindID(login));
		
		for(String s : ingredientsString)
		{
			ingredients.AddIngredient(s);
		}
		ingredientsData.AddIngredients(verification.FindID(login), ingredients);
	
		
		
		ingredientsData.SaveIDs(storageFileLocation+"/ingredients/ids");
		ingredientsData.SaveAllIngredients(storageFileLocation+"/ingredients");
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/UserPage");
		rd.forward(request, response);

	}

}
