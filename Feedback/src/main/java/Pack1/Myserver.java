package Pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Dataacess;
import model.Review;
import office.Admin;
import office.admindao;


@WebServlet("/")
public class Myserver extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path= request.getServletPath();
		
		 switch(path)
		 {
			case "/submitform":getUser(request,response);
			break;
			case "/login":getlogin(request,response);
			break;
			default:userDetails(request,response);
			break;
			}
		
	}

	

	private void userDetails(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher rd = request.getRequestDispatcher("User.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	private void getlogin(HttpServletRequest request, HttpServletResponse response) {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		Admin a= new Admin(user,pass);
		admindao ad = new admindao();
		String status = ad.checkLogin(a);
		if(status.equals("success"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("reviewPage.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			
		}
		
		
		
	



	private void getUser(HttpServletRequest request, HttpServletResponse response) {
		String uname = request.getParameter("name"); 
		String uemail = request.getParameter("email");
		String umessage= request.getParameter("message");
		String ufeedbacktype=request.getParameter("feedback");
		String uratings=request.getParameter("zero");
		Review r = new Review(uname, uemail, umessage, ufeedbacktype, uratings);
		Dataacess da= new Dataacess();
		da.insertUser(r);
		RequestDispatcher rd = request.getRequestDispatcher("User.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
