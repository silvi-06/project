package Employee_update_value;

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
 * Servlet implementation class Employee_update_value
 */
@WebServlet("/Employee_update_value")
public class Employee_update_value extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee_update_value() {
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
		String id = req.getParameter("id");
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
				PreparedStatement pst = con.prepareStatement("update EmployeeTable set name =? , department = ? , email = ? , password= ? , birthdate= ? where id = ?");
				pst.setString(1, name);
				pst.setString(2, department);
				pst.setString(3, email);
				pst.setString(4, password);
				pst.setString(5, birthdate);
				pst.setString(6, id);
				int s =pst.executeUpdate();
				if(s > 0)
				{
					RequestDispatcher rs1 = req.getRequestDispatcher("Show_employee");
					rs1.forward(req, res);
				}
			}
			
		}
		catch(Exception e)
		{
			out.print(e);
		}
	}

}
