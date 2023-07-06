package kaushal.ghimire;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/log.do")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		PrintWriter output = response.getWriter();
//
//		output.println("<html>");
//		output.println("<head>");
//		output.println("<title>First use of Servlet !!</title>");
//		output.println("</head>");
//		output.println("<body>");
//		output.println("WE CAN USE JSP INSTEAD OF SERVLET LATER");
//		output.println("</body>");
//		output.println("</html>");

//		request.getRequestDispatcher("path of jsp").forward(request, response);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

}
