package EmployeeHome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeHome
 */
@WebServlet("/EmployeeHome")
public class EmployeeHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		
		out.print("<!DOCTYPE html>");
		out.print("<html lang=\"en\">");
		out.print("<head>");
		out.print("    <meta charset=\"UTF-8\">");
		out.print("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.print("    <title>Employee Home Page</title>");
		out.print("    <style>");
		out.print("        * {");
		out.print("            margin: 0;");
		out.print("            padding: 0;");
		out.print("            box-sizing: border-box;");
		out.print("            font-family: Arial, sans-serif;");
		out.print("        }");
		out.print("        body {");
		out.print("            background-color: #f4f4f4;");
		out.print("        }");
		out.print("        .header {");
		out.print("            background-color: #333;");
		out.print("            color: white;");
		out.print("            padding: 20px;");
		out.print("            text-align: center;");
		out.print("        }");
		out.print("        .header h1 {");
		out.print("            margin: 0;");
		out.print("        }");
		out.print("        .navbar {");
		out.print("            display: flex;");
		out.print("            justify-content: center;");
		out.print("            background-color: #4CAF50;");
		out.print("            padding: 10px;");
		out.print("        }");
		out.print("        .navbar a {");
		out.print("            color: white;");
		out.print("            padding: 14px 20px;");
		out.print("            text-decoration: none;");
		out.print("            text-align: center;");
		out.print("            border-radius: 5px;");
		out.print("            margin: 0 10px;");
		out.print("        }");
		out.print("        .navbar a:hover {");
		out.print("            background-color: #45a049;");
		out.print("        }");
		out.print("        .container {");
		out.print("            max-width: 1200px;");
		out.print("            margin: 50px auto;");
		out.print("            padding: 20px;");
		out.print("            background-color: white;");
		out.print("            border-radius: 8px;");
		out.print("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);");
		out.print("            text-align: center;");
		out.print("        }");
		out.print("        .container h2 {");
		out.print("            color: #333;");
		out.print("            margin-bottom: 20px;");
		out.print("        }");
		out.print("        .container p {");
		out.print("            color: #666;");
		out.print("            line-height: 1.6;");
		out.print("        }");
		out.print("        .logout-btn {");
		out.print("            display: inline-block;");
		out.print("            padding: 10px 20px;");
		out.print("            background-color: red;");
		out.print("            color: white;");
		out.print("            text-decoration: none;");
		out.print("            border-radius: 5px;");
		out.print("            margin-top: 20px;");
		out.print("            transition: background-color 0.3s ease;");
		out.print("        }");
		out.print("        .logout-btn:hover {");
		out.print("            background-color: darkred;");
		out.print("        }");
		out.print("        /* Additional form styles */");
		out.print("        .form-container {");
		out.print("            margin-top: 20px;");
		out.print("        }");
		out.print("        button {");
		out.print("            width: 100%;");
		out.print("            padding: 10px;");
		out.print("            background-color: #4CAF50;");
		out.print("            color: white;");
		out.print("            border: none;");
		out.print("            border-radius: 5px;");
		out.print("            cursor: pointer;");
		out.print("            font-size: 16px;");
		out.print("            margin-top: 10px;");
		out.print("        }");
		out.print("        button:hover {");
		out.print("            background-color: #45a049;");
		out.print("        }");
		out.print("    </style>");
		out.print("</head>");
		out.print("<body>");
		out.print("    <div class=\"header\">");
		out.print("        <h1>Welcome to Employee Dashboard</h1>");
		out.print("    </div>");
		out.print("    <div class=\"container\">");
		out.print("        <h2>Hello, " + name + "</h2>");
		out.print("        <!-- Hidden Name Form -->");
		out.print("        <div class=\"form-container\">");
		out.print("            <form action=\"Employee_work_see\" method=\"post\">");
		out.print("                <!-- Hidden name field -->");
		out.print("                <input type=\"hidden\" id=\"name\" name=\"name\" value=\"" + name + "\">");
		out.print("                <!-- Button labeled 'Work' -->");
		out.print("                <button type=\"submit\">Work</button>");
		out.print("            </form>");
		out.print("        </div>");
		out.print("    </div>");
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
