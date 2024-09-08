package Employee_update;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee_update
 */
@WebServlet("/Employee_update")
public class Employee_update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee_update() {
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
	     String department = req.getParameter("department");
	     String email = req.getParameter("email");
	     String birthdate = req.getParameter("birthdate");
	     String password = req.getParameter("password");
		
	    out.print("<!DOCTYPE html>");
		out.print("<html lang='en'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.print("<title>Employee Form</title>");
		out.print("<style>");
		out.print("body {");
		out.print("    font-family: Arial, sans-serif;");
		out.print("    background-color: #f4f4f4;");
		out.print("    display: flex;");
		out.print("    justify-content: center;");
		out.print("    align-items: center;");
		out.print("    height: 100vh;");
		out.print("    margin: 0;");
		out.print("}");
		out.print(".form-container {");
		out.print("    background-color: #fff;");
		out.print("    padding: 30px;");
		out.print("    border-radius: 8px;");
		out.print("    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);");
		out.print("    width: 400px;");
		out.print("}");
		out.print("h1 {");
		out.print("    text-align: center;");
		out.print("    color: #333;");
		out.print("    margin-bottom: 20px;");
		out.print("}");
		out.print("form {");
		out.print("    width: 100%;");
		out.print("}");
		out.print("table {");
		out.print("    width: 100%;");
		out.print("    border-spacing: 10px;");
		out.print("}");
		out.print("td {");
		out.print("    padding: 10px 0;");
		out.print("}");
		out.print("label {");
		out.print("    display: inline-block;");
		out.print("    width: 120px;");
		out.print("    font-weight: bold;");
		out.print("    color: #555;");
		out.print("}");
		out.print("input[type='text'], input[type='email'], input[type='password'], input[type='date'] {");
		out.print("    width: calc(100% - 70px);");
		out.print("    padding: 8px;");
		out.print("    border: 1px solid #ddd;");
		out.print("    border-radius: 4px;");
		out.print("}");
		out.print("button {");
		out.print("    width: 100%;");
		out.print("    padding: 10px;");
		out.print("    background-color: #28A745;");
		out.print("    border: none;");
		out.print("    color: white;");
		out.print("    font-size: 16px;");
		out.print("    border-radius: 4px;");
		out.print("    cursor: pointer;");
		out.print("    margin-top: 10px;");
		out.print("}");
		out.print("button:hover {");
		out.print("    background-color: #218838;");
		out.print("}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");

		out.print("<div class='form-container'>");
		out.print("<h1>Employee Registration</h1>");
		out.print("<form action='Employee_update_value' method='post'>");
		out.print("<table>");
		out.print("<tr>");
		out.print("<td><label for='id'>id:</label></td>");
		out.print("<td><input type='hidden' name='id' value="+id+"></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label for='name'>Name:</label></td>");
		out.print("<td><input type='text' name='name' value="+name+"></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label for='department'>Department:</label></td>");
		out.print("<td><input type='text' name='department' value="+department+"></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label for='email'>Email:</label></td>");
		out.print("<td><input type='email' name='email' value="+email+"></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label for='birthdate'>Birthdate:</label></td>");
		out.print("<td><input type='text' name='birthdate' value="+birthdate+"></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label for='password'>Password:</label></td>");
		out.print("<td><input type='text' name='password' value="+password+"></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label for='cpassword'>Confirm Password:</label></td>");
		out.print("<td><input type='text' name='cpassword'  value="+password+"></td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("<button type='submit'>Update</button>");
		out.print("</form>");
		out.print("</div>");

		out.print("</body>");
		out.print("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
