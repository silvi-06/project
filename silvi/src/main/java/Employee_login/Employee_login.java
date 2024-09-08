package Employee_login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee_login
 */
@WebServlet("/Employee_login")
public class Employee_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee_login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		String name= req.getParameter("name");
		String password= req.getParameter("password");
		Boolean Login =false;
		String Eroor="Invalid Credential";
		req.setAttribute("Error", Eroor);
		req.setAttribute("name", name);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/silvi","root","1234");
			PreparedStatement pst= con.prepareStatement("select*from EmployeeTable where name = ? and password = ?");
			pst.setString(1, name);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();	
			while(rs.next())
			{
				Login=true;
			}
			if(Login)
			{
				RequestDispatcher rd = req.getRequestDispatcher("EmployeeHome?name="+name);
				rd.forward(req, res);
			}
			else
			{
				RequestDispatcher rs1 = req.getRequestDispatcher("Employee_login.jsp");
				rs1.forward(req, res);
			}
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
