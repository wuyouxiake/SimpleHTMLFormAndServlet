import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Properties;

/**
 * Servlet implementation class GetList
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	String firstname;
	String lastname;
	String sex;
	String description;
	String school;
	public void init() throws ServletException {
		// Do required initialization
		
	}
	
	@SuppressWarnings("null")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		firstname = request.getParameter("firstname");
		lastname = request.getParameter("lastname");
		sex = request.getParameter("sex");
		description = request.getParameter("description");
		school = request.getParameter("school");
		
		
		
		request.setAttribute("firstname",firstname);
		request.setAttribute("lastname",lastname);
		request.setAttribute("sex",sex);
		request.setAttribute("description",description);
		request.setAttribute("school",school);
		
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
			
	}


	public void destroy() {
		// do nothing.
	}

	
	
}
