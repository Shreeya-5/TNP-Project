package tnp.controller;

import java.io.IOException;
import java.util.List;
import tnp.model.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tnp.dao.DisplayScheduleDao;
import tnp.dao.DisplayStudDao;
import tnp.model.Schedule;

/**
 * Servlet implementation class DisplayStudReg
 */
@WebServlet("/DisplayStudReg")
public class DisplayStudReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayStudReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DisplayStudDao displaystud=new DisplayStudDao();
		List<StudRegister>lst=displaystud.getAllStudent();
			
		for(StudRegister std:lst) {
			System.out.println(std.getCno()+"\t"+std.getBranch());
		}
//		request.setAttribute("schedlist", lst);
//		RequestDispatcher view=request.getRequestDispatcher("SchduleList.jsp");
//		view.forward(request, response);
		HttpSession session=request.getSession();
		session.setAttribute("studlst", lst);
		if(lst!=null) {
			response.sendRedirect("StudentList.jsp");
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
