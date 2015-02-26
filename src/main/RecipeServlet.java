package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



/**
 * Servlet implementation class RecipeServlet
 */
@WebServlet("/Home/*")
public class RecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		
		System.out.println(request.getRequestURI());
		
		if(request.getRequestURI().endsWith("/Home"))
		{
			System.out.println("home");
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Home.jsp");
			rd.forward(request, response);
		}
		else if(request.getRequestURI().endsWith("/Home/search"))
		{
			System.out.println("searching");
		URL api = new URL("http://api.pearson.com:80/kitchen-manager/v1/recipes?ingredients-any=pork");
		URLConnection yc = api.openConnection();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        
        PrintWriter writer = response.getWriter();
        String add = "";
        
        while ((inputLine = in.readLine()) != null)
        {
            JsonParser parse = new JsonParser();
            JsonElement element = parse.parse(inputLine);
            JsonObject jObj = element.getAsJsonObject();
            JsonArray jArray = jObj.getAsJsonArray("results");
            for(int i=0; i<jArray.size(); i++)
            {
            	JsonObject c = jArray.get(i).getAsJsonObject();
            	//System.out.println(c.get("name").toString() + ", " + c.get("url").toString() + ", " + c.get("ingredients").toString());
            	add += "<div>";
            	add += "<img src=" + c.get("image").toString() + "/> ";
            	add += "<br/>";
            	add += c.get("name").toString();
            	add += "<br/>";
            	add += c.get("ingredients").toString();
            	add += "</div>";
            	/*
            	writer.append("<img src=" + c.get("image").toString() + "/> ");
            	writer.append("<br/>");
            	writer.append(c.get("name").toString());
            	writer.append("<br/>");
            	writer.append(c.get("ingredients").toString());
            	writer.append("</div>");
            	*/
            }
        }
        in.close();
        
        request.setAttribute("recipe", add);
        System.out.println(add);
        RequestDispatcher rd = request.getRequestDispatcher("/RecipeFinder.jsp");
		rd.forward(request, response);
		}
		else if(request.getRequestURI().endsWith(".css"))
		{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}

}
