package Employee_work_see;

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
 * Servlet implementation class Employee_work_see
 */
@WebServlet("/Employee_work_see")
public class Employee_work_see extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee_work_see() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		System.out.print(name);
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/silvi","root","1234");
			PreparedStatement pst= con.prepareStatement("select*from work_assign where emp_name = ?");
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				String id = rs.getString(1);
				String work = rs.getString(4);
				String day = rs.getString(5);
				String date = rs.getString(6);
				String status = rs.getString(7);
				
				out.print("<!DOCTYPE html>");
				out.print("<html lang='en'>");
				out.print("<head>");
				out.print("    <meta charset='UTF-8'>");
				out.print("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
				out.print("    <title>Task Box</title>");
				out.print("    <style>");
				out.print("        * {");
				out.print("            box-sizing: border-box;");
				out.print("            margin: 0;");
				out.print("            padding: 0;");
				out.print("            font-family: Arial, sans-serif;");
				out.print("        }");
				out.print("        body {");
				out.print("            display: flex;");
				out.print("            justify-content: center;");
				out.print("            align-items: center;");
				out.print("            height: 100vh;");
				out.print("            background-color: #f4f4f4;");
				out.print("        }");
				out.print("        .box-container {");
				out.print("            width: 300px;");
				out.print("            padding: 20px;");
				out.print("            background-color: #ffffff;");
				out.print("            border-radius: 8px;");
				out.print("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);");
				out.print("            text-align: center;");
				out.print("        }");
				out.print("        .box-container h3 {");
				out.print("            margin-bottom: 10px;");
				out.print("            color: #333;");
				out.print("        }");
				out.print("        .box-container p {");
				out.print("            margin: 5px 0;");
				out.print("            color: #666;");
				out.print("            font-size: 16px;");
				out.print("        }");
				out.print("        .complete-btn {");
				out.print("            display: inline-block;");
				out.print("            padding: 10px 20px;");
				out.print("            background-color: #4CAF50;");
				out.print("            color: white;");
				out.print("            text-decoration: none;");
				out.print("            border: none;");
				out.print("            border-radius: 5px;");
				out.print("            cursor: pointer;");
				out.print("            margin-top: 20px;");
				out.print("            font-size: 16px;");
				out.print("        }");
				out.print("        .complete-btn:hover {");
				out.print("            background-color: #45a049;");
				out.print("        }");
				out.print("    </style>");
				out.print("</head>");
				out.print("<body>");

				out.print("<div class='box-container'>");
				out.print("    <h3>Work:"+work+"</h3>");
				out.print("    <p>Day: "+day+"</p>");  // Dynamically set the day here
				out.print("    <p>Date: "+date+"</p>");  // Dynamically set the date here
				if(status.equals("pending"))
				{
					out.print("    <form action='complete_task' method='post'>");
					out.print("<input type='hidden' value="+id+" name='id'>");
					out.print("        <button type='submit' class='complete-btn'>Complete</button>");
					out.print("    </form>");
				}
				out.print("</div>");
				out.print("</body>");
				out.print("</html>");

			}
		}
		catch(Exception e)
		{
			out.print(e);
		}
		
		
	}

}
