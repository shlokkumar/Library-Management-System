package librarynew;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginb")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String u = request.getParameter("unm");
		String p = request.getParameter("pwd");
		String q = "Select * from login";

		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/login.db");
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(q);
			int f = 0;
			while (rs.next()) {
				if (u.equals(rs.getString("uname")) && p.equals(rs.getString("password"))) {
					f = 1;
					break;
				}
			}
			if (f == 1) {
				request.getSession().setAttribute("unm", u);
				request.getRequestDispatcher("First_lib.jsp").include(request, response);
			} else {
				pw.println(
						"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
				pw.println("Incorrect Credentials");

				request.getRequestDispatcher("LoginFirst.html").include(request, response);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
