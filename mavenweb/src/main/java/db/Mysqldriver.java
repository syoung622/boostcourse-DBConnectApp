package db;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletConfig;

/**
 * Servlet implementation class Mysqldriver
 */
public class Mysqldriver extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}

}
