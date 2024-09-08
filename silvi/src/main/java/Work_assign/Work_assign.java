package Work_assign;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Work_assign
 */
@WebServlet("/Work_assign")
public class Work_assign extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Work_assign() {
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
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String work = req.getParameter("work");
		String day = req.getParameter("day");
		String date = req.getParameter("date");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/silvi", "root", "1234");
		    PreparedStatement pst = con.prepareStatement("insert into work_assign (emp_id,emp_name,work,day,date) values (?,?,?,?,?)");
		    pst.setString(1, id);
		    pst.setString(2, name);
		    pst.setString(3, work);
		    pst.setString(4, day);
		    pst.setString(5, date);
		    
		    int s = pst.executeUpdate();
		    if(s>0)
		    {
		    	res.sendRedirect("AdminHome.jsp");
		    }
		    else
		    {
		    	out.print("Not Added");
		    }
		}
		catch(Exception e)
		{
			out.print(e);
		}
		
		
		
		
	}

}
