package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoSearch;
import entity.Content;
import entity.Member;

/**
 * Servlet implementation class Search
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		Member mem = (Member) request.getSession().getAttribute("theLastUser");
		int id = mem.getId();
		String txtSearch = request.getParameter("search");
		DaoSearch daosearch = new DaoSearch();
		List<Content> list = daosearch.search(txtSearch,id);
		if(txtSearch == "" || list.isEmpty()) {
			request.setAttribute("mess", "Không tìm thấy nội dung :(");
			request.getRequestDispatcher("search.tiles").forward(request, response);
		}else {
			request.setAttribute("listSearch", list);
			request.getRequestDispatcher("search.tiles").forward(request, response);
		}
	}

}