package tnp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import tnp.dao.StudRegDao;
import tnp.model.StudRegister;

/**
 * Servlet implementation class SearchStudentController
 */
@WebServlet("/SearchStudentController")
public class StudentSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cno=request.getParameter("cno");
		System.out.println("test2");
		StudRegDao sdao=new StudRegDao();
		
		StudRegister robj=sdao.Search(cno);
		System.out.println("test1");
		HttpSession session=request.getSession();
		session.setAttribute("search", robj);
		if(robj!=null) {
			System.out.println(robj.getCno()+"\t"+robj.getCgpa());
			response.sendRedirect("SearchStudRecord.jsp");
		}
		else {
			response.sendRedirect("Error.jsp");
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
