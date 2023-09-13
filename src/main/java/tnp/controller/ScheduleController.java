package tnp.controller;
import tnp.dao.ScheduleDao;
import  tnp.model.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScheduleController
 */
@WebServlet("/ScheduleController")
public class ScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScheduleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmpname=request.getParameter("cmpname");
		String comingdate=request.getParameter("comingdate");
		String time=request.getParameter("time");
		String modeofpreocess=request.getParameter("modeofprocess");
		String event=request.getParameter("event");
		String branch=request.getParameter("branch");
		double cgpa=Double.parseDouble(request.getParameter("cgpa"));
		int stiphend=Integer.parseInt(request.getParameter("stiphend"));
		String location=request.getParameter("location");
		
		Schedule sch=new Schedule(cmpname,comingdate,time, modeofpreocess,event,branch,cgpa,stiphend,location);
		List<Schedule> lstsch=new LinkedList<>();
	
		lstsch.add(sch);
		
		ScheduleDao schdao=new ScheduleDao();
		int i=schdao.create(lstsch);
		if(i>0) {
			System.out.println("Schedule inserted..");
//			PrintWriter pw=response.getWriter();
//			pw.println("<h1>Schedult inserted</h1>");
			response.sendRedirect("ScheduleAdded.jsp");
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
