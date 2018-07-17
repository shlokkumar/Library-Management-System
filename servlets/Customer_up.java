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
 * Servlet implementation class Custup
 */
@WebServlet("/Custup")
public class Custup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int eno = Integer.parseInt(request.getParameter("cno"));
		int age = Integer.parseInt(request.getParameter("cage"));
		String name = request.getParameter("cnm");
		String city = request.getParameter("city");
		String state = request.getParameter("cstate");

		Connection con = null;
		try {
			
			Class.forName("org.sqlite.JDBC");
			
			con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/library.db");
			PreparedStatement ps = con.prepareStatement("Update emp set eno=?, ename=?, ecity=?, estate=?, eage=? where eno=?");
			ps.setInt(1, eno);
			ps.setString(2, name);
			ps.setString(3, city);
			ps.setString(4, state);
			ps.setInt(5, age);
			ps.setInt(6, eno);
			int i = ps.executeUpdate();
			
			
			if (i>0) {
				pw.println(
						"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
				pw.print("<h2>Employee No: " + eno + " Updated</h2>");
				pw.println("<br>\r\n" + 
						"	<form action=\"Emp_Items.jsp\"\">\r\n" + 
						"		<input type=\"submit\" value=\"Options\" />\r\n" + 
						"	</form>");

			} else {
				pw.println("<h2>Employee doesn't exist</h2>");
				request.getRequestDispatcher("Emp_Upd.jsp").include(request, response);
				pw.println("<br>\r\n" + 
						"	<form action=\"Emp_Items.jsp\"\">\r\n" + 
						"		<input type=\"submit\" value=\"Options\" />\r\n" + 
						"	</form>");
				
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
