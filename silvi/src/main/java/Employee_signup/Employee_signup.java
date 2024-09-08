package Employee_signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee_signup
 */
@WebServlet("/Employee_signup")
public class Employee_signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee_signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String department = req.getParameter("department");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String cpassword = req.getParameter("cpassword");
		String birthdate = req.getParameter("birthdate");
		try 
		{
			if(password.equals(cpassword))
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/silvi","root","1234");
				PreparedStatement pst = con.prepareStatement("insert into EmployeeTable (name,department,email,password,birthdate) values (?,?,?,?,?)");
				pst.setString(1, name);
				pst.setString(2, department);
				pst.setString(3, email);
				pst.setString(4, password);
				pst.setString(5, birthdate);
				int s =pst.executeUpdate();
				if(s > 0)
				{
					RequestDispatcher rs1 = req.getRequestDispatcher("AdminHome.jsp");
					rs1.forward(req, res);
				}
			}
			else
			{
				RequestDispatcher rs2 = req.getRequestDispatcher("Employee_signup.jsp");
				rs2.forward(req, res);
			}
			
		}
		catch(Exception e)
		{
			out.print(e);
		}
	}

}
