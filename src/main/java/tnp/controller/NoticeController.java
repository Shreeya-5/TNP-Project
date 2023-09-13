package tnp.controller;

import java.io.IOException;
import java.util.List;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tnp.dao.NoticeDao;
import tnp.model.NoticeM;

/**
 * Servlet implementation class NoticeController
 */
@WebServlet("/NoticeController")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noticeno=Integer.parseInt(request.getParameter("noticeno"));	
		String noticesent=request.getParameter("noticesent");
		
		NoticeM nmodel=new NoticeM(noticeno,noticesent);
		
		List<NoticeM> lstntc=new LinkedList<>();
		lstntc.add(nmodel);
		NoticeDao noticedao=new NoticeDao();
		int i=noticedao.Create(lstntc);
		
		if(i>0) {
			System.out.println("Notice written");
			response.sendRedirect("AdminDashboard.jsp");
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
