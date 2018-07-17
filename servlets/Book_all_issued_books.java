package librarynew;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bookai
 */
@WebServlet("/Bookai")
public class Bookai extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String q = "select * from issue";

		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			
			con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/library.db");
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			out.println(
					"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");

			out.print("<table border='1' width='100%'");
			out.print("<tr><th>Book Name</th><th>Customer number</th><th>Duration</th><th>Status</th></tr>");
			while (rs.next()) {
				out.println("<tr><td>" + rs.getString("bname") + "</td><td>" + rs.getInt("cis") + "</td><td>"
						+ rs.getInt("duration") + "</td><td>" + rs.getString("issret") + "</td></tr>");
			}
			out.print("</table>");

			out.println("<br>\r\n" + "	<form action=\"Book_Items.jsp\"\">\r\n"
					+ "		<input type=\"submit\" value=\"Options\" />\r\n" + "	</form>");

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
