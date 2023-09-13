package tnp.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tnp.dao.ExperienceDao;
import tnp.dao.NoticeDao;
import tnp.model.Experience;
import tnp.model.NoticeM;

/**
 * Servlet implementation class ExperienceController
 */
@WebServlet("/ExperienceController")
public class ExperienceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExperienceController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname=request.getParameter("sname");
		String cno=request.getParameter("cno");
		String cmpname=request.getParameter("cmpname");
		String exp=request.getParameter("exp");
		
		
		Experience es=new Experience(sname,cno,cmpname,exp);
		
		List<Experience> lstexp=new LinkedList<>();
		lstexp.add(es);
		ExperienceDao expdao=new ExperienceDao();
		int i=expdao.Create(lstexp);
		
		if(i>0) {
			System.out.println("exp written");
			response.sendRedirect("ExperiConfirm.jsp");
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
