package librarynew;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Custdel
 */
@WebServlet("/Custdel")
public class Custdel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int eno = Integer.parseInt(request.getParameter("cno"));

		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			
			con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/library.db");
			PreparedStatement ps = con.prepareStatement("Delete from emp where eno=?");
			ps.setInt(1, eno);
			int i = ps.executeUpdate();
			if (i > 0) {
				out.println(
						"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
				out.println("<h2>Employee's record deleted</h2>");
				out.println("<br>\r\n" + "	<form action=\"Emp_Items.jsp\"\">\r\n"
						+ "		<input type=\"submit\" value=\"Options\" />\r\n" + "	</form>");
			} else {
				out.print("<h2>No such record</h2>");
				request.getRequestDispatcher("Emp_Del.jsp").include(request, response);
				out.println("<br>\r\n" + "	<form action=\"Options_Emp.jsp\"\">\r\n"
						+ "		<input type=\"submit\" value=\"Options\" />\r\n" + "	</form>");
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
