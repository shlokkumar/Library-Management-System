package librarynew;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bookis
 */
@WebServlet("/Bookis")
public class Bookis extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String bid = (String) request.getSession().getAttribute("bnm");
		int cid = Integer.parseInt(request.getParameter("cno"));
		int dur = Integer.parseInt(request.getParameter("dur"));

		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/library.db");
			Statement statement = con.createStatement();
			ResultSet rs1 = statement.executeQuery("Select * from issue where cis=" + cid);
			if (dur > 14) {
				pw.println(
						"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
				pw.println("<h3>Duration must be less than 14 days</h3>");
				pw.println("<br>\r\n" + "	<form action=\"Book_Items.jsp\"\">\r\n"
						+ "		<input type=\"submit\" value=\"Options\" />\r\n" + "	</form>");
			}

			else {
				rs1 = statement.executeQuery("Select * from emp");
				int f = 0;
				while (rs1.next()) {
					if (rs1.getInt("eno") == cid) {
						f = 1;
						break;
					}
				}

				if (f == 1) {
					PreparedStatement ps = con.prepareStatement("Insert into issue values(?,?,?,?)");
					ps.setString(1, bid);
					ps.setInt(2, cid);
					ps.setInt(3, dur);
					ps.setString(4, "Issued");
					int j = ps.executeUpdate();
					if (j > 0) {
						pw.println(
								"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
						pw.print("<h2>" + bid + " Issued to " + cid);
						pw.println("<br>\r\n" + "	<form action=\"Book_Items.jsp\"\">\r\n"
								+ "		<input type=\"submit\" value=\"Options\" />\r\n" + "	</form>");
					}
				} else {
					pw.println(
							"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
					pw.println("<h3>User does not exist</h3>");
					pw.println("<br>\r\n" + "	<form action=\"Book_Items.jsp\"\">\r\n"
							+ "		<input type=\"submit\" value=\"Options\" />\r\n" + "	</form>");
				}

			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
