package AdminLogin;

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
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/silvi","root","1234");
			PreparedStatement pst = con.prepareStatement("select * from AdminTable where name= ? and password = ?");
			pst.setString(1,name );
			pst.setString(2, password);
			Boolean Login=false;
			ResultSet rs =pst.executeQuery();
			req.setAttribute("name",name);
			String Error= "Invalid Credential.";
			req.setAttribute("Error",Error);
			
			while(rs.next())
			{
				Login=true;
			}
			if(Login)
			{
				RequestDispatcher rs1 = req.getRequestDispatcher("AdminHome.jsp");
				rs1.forward(req, res);
			}
			else
			{
				RequestDispatcher rs2 = req.getRequestDispatcher("AdminLogin.jsp");
				rs2.forward(req, res);
			}
			
		}
		catch(Exception e)
		{
			out.print("Error Ocuured!");
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
