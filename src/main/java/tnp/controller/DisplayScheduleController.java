package tnp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tnp.dao.DisplayScheduleDao;
import tnp.model.Schedule;

/**
 * Servlet implementation class DisplayScheduleController
 */
@WebServlet("/DisplayScheduleController")
public class DisplayScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayScheduleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DisplayScheduleDao displaydao=new DisplayScheduleDao ();
		List<Schedule>lst=displaydao.getAllSchedule();
			
		for(Schedule s:lst) {
			System.out.println(s.getCmpname()+"\t"+s.getLocation());
		}
//		request.setAttribute("schedlist", lst);
//		RequestDispatcher view=request.getRequestDispatcher("SchduleList.jsp");
//		view.forward(request, response);
		HttpSession session=request.getSession();
		session.setAttribute("schelst", lst);
		if(lst!=null) {
			response.sendRedirect("ScheduleList.jsp");
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
