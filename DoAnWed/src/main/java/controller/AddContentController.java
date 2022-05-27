package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.DaoAddContent;
import entity.Member;
/**
 * Servlet implementation class AddContentController
 */
public class AddContentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContentController() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		Member a = new Member();
		a = (Member)session.getAttribute("theLastUser");
		int id = a.getId();
		
		String title=request.getParameter("title");
		String brief=request.getParameter("brief");
		String content=request.getParameter("content");
		
		DaoAddContent addcontent = new DaoAddContent();
		addcontent.addContent(id, title, brief, content);
		response.sendRedirect("formContent.tiles");
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}