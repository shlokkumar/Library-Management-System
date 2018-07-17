package librarynew;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bookre")
public class Bookre extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int cno = Integer.parseInt(request.getParameter("cno"));
		String s = (String) request.getSession().getAttribute("bnm");

		Connection con = null;
		System.out.println(s);

		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/library.db");
			Statement statement = con.createStatement();
			ResultSet rs1 = statement.executeQuery("Select * from issue where cis=? and issret='Issued'");
			if (!rs1.isBeforeFirst() ) {
				PreparedStatement ps = con.prepareStatement("Delete from issue where cis=? and issret='Issued' and bname=?");
				ps.setInt(1, cno);
				ps.setString(2, s);
				int j = ps.executeUpdate();
				if (j > 0) {
					out.println("<h2>Book " + s + " Returned</h2>");
					request.getRequestDispatcher("Book_Items.jsp").include(request, response);
					
				}
				
			}
			else {
				out.print("<h2>No Issued Books or Customer Number is Wrong</h2>");
				request.getRequestDispatcher("Books_return.jsp").include(request, response);
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
