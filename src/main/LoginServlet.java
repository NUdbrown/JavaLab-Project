package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Recipe/Login*")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserVerification verification;
	String storageFileLocation;
    public LoginServlet(String storageFileLocation) {
        super();
        verification = new UserVerification();
        this.storageFileLocation = storageFileLocation;
        
        try {
			verification.LoadIDs(storageFileLocation+"/ids");
			verification.LoadAllLogins(storageFileLocation+"/users");
		 
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			verification.LoadIDs(storageFileLocation+"/ids");
			verification.LoadAllLogins(storageFileLocation+"/users");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatus(500);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/500InternalServerError.jsp");
			rd.forward(request, response);	
		}
		
		if(verification.userIDMap.containsKey(new UserLogin(request.getParameter("Email"), request.getParameter("SuperSecurePassword"))))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/UserPage");
			rd.forward(request, response);
		}
		else
		{
			response.setStatus(404);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/InvalidUserOrPass.jsp");
			rd.forward(request, response);	
		}
	}

}
