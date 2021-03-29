package db;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class connection
 */
public class connection extends HttpServlet {
	public class ConnectionProvider {
		private static String dburl = "jdbc:mysql://localhost:3306/board?serverTimezone=UTC&verifyServerCertificate=false&useSSL=false";
		private static String dbUser = ""; //input dbUser
		private static String dbpasswd = "";  // input dbPasswd

		public static Connection getConnection() throws SQLException {
			return DriverManager.getConnection(dburl, dbUser, dbpasswd);
		}
	}
}
