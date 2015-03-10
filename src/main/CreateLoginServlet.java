package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateLoginServlet
 */
@WebServlet("/Recipe/User")
public class CreateLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserVerification verification;
	String storageFileLocation = "C:/Users/Zach OSullivan/Desktop/Recipes";
	
    public CreateLoginServlet(String storageFileLocation) {
        super();
        
        verification = new UserVerification();
        this.storageFileLocation = storageFileLocation;
        
        try {
			verification.LoadIDs(storageFileLocation+"/users/ids");
			verification.LoadAllLogins(storageFileLocation+"/users");
		 
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		try {
			verification.LoadIDs(storageFileLocation+"/users/ids");
			verification.LoadAllLogins(storageFileLocation+"/users");
		
			if(!verification.userIDMap.containsKey(new UserLogin(request.getParameter("Email"), request.getParameter("SuperSecurePassword"))))
			{
				verification.CreateNewLogin(request.getParameter("Email"), request.getParameter("SuperSecurePassword"));
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/UsernamePasswordComboTaken.jsp");
				rd.forward(request, response);	
			}
			
			verification.SaveAllLogins(storageFileLocation+"/users");
			verification.SaveIDs(storageFileLocation+"/users/ids");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatus(500);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/500InternalServerError.jsp");
			rd.forward(request, response);	
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/UserPage");
		rd.forward(request, response);

		
	}

}
