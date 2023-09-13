package tnp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tnp.model.*;
import tnp.dao.*;
/**
 * Servlet implementation class DisplayNoticeController
 */
@WebServlet("/DisplayNoticeController")
public class DisplayNoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayNoticeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DisplayNoticeDao disnoticedao=new DisplayNoticeDao();
		List<NoticeM> lstntc=disnoticedao.getAllNotice();
		HttpSession session=request.getSession();
		session.setAttribute("noticelst", lstntc);
		if(lstntc!=null) {
			response.sendRedirect("NoticeList.jsp");
		}
		else {
			response.sendRedirect("Errot.jsp");
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
