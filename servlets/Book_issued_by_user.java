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

@WebServlet("/Bookvi")
public class Bookvi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int cno = Integer.parseInt(request.getParameter("cno"));
		String q = "Select * from emp where eno=" + cno;

		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/library.db");
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(q);
			if (rs.isBeforeFirst()) {

				rs = statement.executeQuery("Select * from issue where cis=" + cno);
				if (rs.isBeforeFirst()) {

					out.println(
							"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
					out.print("<table border='1' width='100%'");
					out.print("<tr><th>Book Name</th><th>Customer Number</th><th>Status</th></tr>");
					while (rs.next()) {
						out.print("<tr><td>" + rs.getString("bname") + "</td><td>" + rs.getInt("cis") + "</td><td>"
								+ rs.getString("issret") + "</td></tr>");
					}
					out.print("</table>");
					out.println("<br>\r\n" + "	<form action=\"Book_Items.jsp\"\">\r\n"
							+ "		<input type=\"submit\" value=\"Action!!\" />\r\n" + "	</form>");

				} else {
					out.println(
							"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
					out.println("<h2>No books issued by : " + cno + "</h2>");
					out.println("<br>\r\n" + "	<form action=\"Book_Items.jsp\"\">\r\n"
							+ "		<input type=\"submit\" value=\"Options\" />\r\n" + "	</form>");
				}

			} else {
				out.println(
						"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
				out.println("<h2>User doesn't exist</h2>");
				out.println("<br>\r\n" + "	<form action=\"Book_Items.jsp\"\">\r\n"
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
