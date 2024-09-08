package work;

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
 * Servlet implementation class work
 */
@WebServlet("/work")
public class work extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public work() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/silvi", "root", "1234");
		    PreparedStatement pst = con.prepareStatement("select * from work_assign where emp_id = ?");
		    pst.setString(1, id);
		    ResultSet rs = pst.executeQuery();
		    
		    out.print("<html>");
		    out.print("<body>");
		    out.print("<h2>Add Work:</h2>");
		    String linkworkadd = "Employee_add_work?id=" + id+"&name=" + name;
		    out.print("<a href=" + linkworkadd + " style='padding: 8px 12px; background-color: green; color: white; text-decoration: none; border-radius: 5px; margin-right: 5px;'>Add Work</a>");
		    out.print("<br>");
		    out.print("<h2>Previous Work</h2>");
		    out.print("</body>");
		    out.print("</html>");
		    
		    while(rs.next())
		    {
		    	String emp_id = rs.getString(2);
		    	String emp_name = rs.getString(3);
		    	String work = rs.getString(4);
		    	String day = rs.getString(5);
		    	String date = rs.getString(6);
		    	String status = rs.getString(7);
		    	
		    	    out.print("<!DOCTYPE html>");
		    	    out.print("<html lang='en'>");
		    	    out.print("<head>");
		    	    out.print("<meta charset='UTF-8'>");
		    	    out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		    	    out.print("<title>Employee Work Status</title>");
		    	    out.print("<style>");
		    	    out.print(".employee {");
		    	    out.print("border: 1px solid #000;");
		    	    out.print("padding: 15px;");
		    	    out.print("margin: 20px;");
		    	    out.print("background-color: #f4f4f4;");
		    	    out.print("width: 300px;");
		    	    out.print("}");
		    	    out.print(".employee div {");
		    	    out.print("margin-bottom: 10px;");
		    	    out.print("font-family: Arial, sans-serif;");
		    	    out.print("font-size: 14px;");
		    	    out.print("}");
		    	    out.print("</style>");
		    	    out.print("</head>");
		    	    out.print("<body>");
		    	   

		    	    out.print("<div class='employee'>");
		    	    out.print("<div>Emp ID: " + emp_id + "</div>");
		    	    out.print("<div>Emp Name: " + emp_name + "</div>");
		    	    out.print("<div>Work: " + work + "</div>");
		    	    out.print("<div>Day: " + day + "</div>");
		    	    out.print("<div>Date: " + date + "</div>");
		    	    out.print("<div>Status: " + status + "</div>");
		    	    out.print("</div>");
		    	    out.print("</body>");
		    	    out.print("</html>");
		    	    }
		  
		    
		}
		catch(Exception e)
		{
			out.print(e);		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
