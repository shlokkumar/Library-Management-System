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

/**
 * Servlet implementation class Custadd
 */
@WebServlet("/Custadd")
public class Custadd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int eno = Integer.parseInt(request.getParameter("cno"));
		String enm = request.getParameter("cnm");
		int eage = Integer.parseInt(request.getParameter("cage"));
		String ecity = request.getParameter("city");
		String estate = request.getParameter("cstate");

		int f = 0;

		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			
			con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/library.db");
			System.out.println("Done");
			String q1 = "Select eno from emp";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(q1);
			while (rs.next()) {
				if (eno == rs.getInt("eno")) {
					f = 1;
					break;
				}
			}
			if (f == 0) {
				String q2 = "Insert into emp values(?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(q2);
				ps.setInt(1, eno);
				ps.setString(2, enm);
				ps.setString(3, ecity);
				ps.setString(4, estate);
				ps.setInt(5, eage);
				int i = ps.executeUpdate();
				if (i > 0) {
					pw.println(
							"<body style=\"background: url(https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?cs=srgb&dl=animal-countryside-equine-635499.jpg&fm=jpg);\">");
					pw.println("<h3>Data Inserted</h3><br>");
					pw.println("<br>\r\n" + "	<form action=\"Emp_Items.jsp\"\">\r\n"
							+ "		<input type=\"submit\" value=\"Options\" />\r\n" + "	</form>");
					
				}
			} else {
				pw.print("<h1>Employee Number Exists</h1>");
				request.getRequestDispatcher("Emp_Add.jsp").include(request, response);
				pw.println("<br>\r\n" + "	<form action=\"Emp_Items.jsp\"\">\r\n"
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
