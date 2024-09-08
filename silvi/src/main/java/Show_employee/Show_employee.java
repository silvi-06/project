package Show_employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Show_employee
 */
@WebServlet("/Show_employee")
public class Show_employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show_employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/silvi", "root", "1234");
		    PreparedStatement pst = con.prepareStatement("select * from EmployeeTable");
		    ResultSet rs = pst.executeQuery();

		    out.print("<html>");
		    out.print("<body style='background-color: #f4f4f4; font-family: Arial, sans-serif;'>"); // Added background color and font

		    out.print("<div style='width: 80%; margin: 50px auto; padding: 20px; background-color: white; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);'>"); // Main container for layout

		    out.print("<h2 style='text-align: center; color: #333;'>Employee Details</h2>"); // Styled heading

		    out.print("<table style='width: 100%; border-collapse: collapse;'>"); // Table with full width and collapsed borders
		    out.print("<thead>");  // Table head section for styling
		    out.print("<tr style='background-color: #4CAF50; color: white;'>"); // Header row with green background
		    out.print("<th style='padding: 10px; border: 1px solid #ddd;'>ID</th>");
		    out.print("<th style='padding: 10px; border: 1px solid #ddd;'>Name</th>");
		    out.print("<th style='padding: 10px; border: 1px solid #ddd;'>Department</th>");
		    out.print("<th style='padding: 10px; border: 1px solid #ddd;'>Email</th>");
		    out.print("<th style='padding: 10px; border: 1px solid #ddd;'>Birthdate</th>");
		    out.print("<th style='padding: 10px; border: 1px solid #ddd;'>Password</th>");
		    out.print("<th style='padding: 10px; border: 1px solid #ddd;'>Actions</th>");
		    out.print("<th style='padding: 10px; border: 1px solid #ddd;'>Work Assign</th>");
		    out.print("</tr>");
		    out.print("</thead>");
		    out.print("<tbody>");  // Table body for data rows

		    while (rs.next()) {
		        String id = rs.getString(1);
		        String name = rs.getString(2);
		        String department = rs.getString(3);
		        String email = rs.getString(4);
		        String birthdate = rs.getString(6);
		        String password = rs.getString(5);
		        String linkupdate = "Employee_update?id="+id+"&name=" + name + "&department=" + department + "&email=" + email + "&birthdate=" + birthdate+"&password="+password;
		        String linkdelete = "Employee_delete?id=" + id;
		        String linkshowwork = "work?id=" + id+"&name=" + name;

		        out.print("<tr style='text-align: center; background-color: #f9f9f9;'>"); // Alternating background color for rows
		        out.print("<td style='padding: 10px; border: 1px solid #ddd;'>" + id + "</td>");
		        out.print("<td style='padding: 10px; border: 1px solid #ddd;'>" + name + "</td>");
		        out.print("<td style='padding: 10px; border: 1px solid #ddd;'>" + department + "</td>");
		        out.print("<td style='padding: 10px; border: 1px solid #ddd;'>" + email + "</td>");
		        out.print("<td style='padding: 10px; border: 1px solid #ddd;'>" + birthdate + "</td>");
		        out.print("<td style='padding: 10px; border: 1px solid #ddd;'>" + password + "</td>");
		        out.print("<td style='padding: 10px; border: 1px solid #ddd;'>");

		        // Update and Delete buttons with styling
		        out.print("<a href=" + linkupdate + " style='padding: 8px 12px; background-color: green; color: white; text-decoration: none; border-radius: 5px; margin-right: 5px;'>Update</a>");
		        out.print("<a href=" + linkdelete + " style='padding: 8px 12px; background-color: red; color: white; text-decoration: none; border-radius: 5px;'>Delete</a>");
		        out.print("</td>");
		        out.print("<td style='padding: 10px; border: 1px solid #ddd;'>");
		        out.print("<a href=" + linkshowwork + " style='padding: 8px 12px; background-color: green; color: white; text-decoration: none; border-radius: 5px; margin-right: 5px;'>show Work</a>");
		        out.print("</td>");
		       
		        out.print("</tr>");
		    }

		    out.print("</tbody>");
		    out.print("</table>");
		    out.print("</div>");  // Close main container
		    out.print("</body>");
		    out.print("</html>");
		}
		catch(Exception e)
		{
			out.print(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
