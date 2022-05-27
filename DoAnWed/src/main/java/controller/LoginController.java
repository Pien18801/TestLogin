package controller;
import dao.DaoLogin;
import entity.Member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("msg","");
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
resp.setContentType("text/html;charset=UTF-8");
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		try {
			DaoLogin dao = new DaoLogin();
			Member member = dao.checkLogin(email, password);			
			if(member != null)
			{
				int id = member.getId();
				int role_id = dao.checkRole(id);
				HttpSession session = req.getSession(false);
				// set attribute for new session
				session.setAttribute("id", id);
				// set timeout session (seconds)
				//session.setMaxInactiveInterval(60);
				// login success
				if(role_id == 1)
					resp.sendRedirect("viewContent.jsp");
				if(role_id == 2)
					resp.sendRedirect("home.jsp");
					
			}else {			
				// login failed
				req.setAttribute("msg","Email or password is incorrect!");
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
				dispatcher.forward(req, resp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}