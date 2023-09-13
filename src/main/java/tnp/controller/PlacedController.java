package tnp.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tnp.model.*;
import tnp.dao.*;
/**
 * Servlet implementation class PlacedController
 */
@WebServlet("/PlacedController")
public class PlacedController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlacedController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmpname=request.getParameter("cmpname");
		String cno=request.getParameter("cno");
		Placed p=new Placed(cmpname,cno);
		List<Placed> lstplc=new LinkedList<>();
		lstplc.add(p);
		PlacedDao pdao=new PlacedDao();
		int i=pdao.Create(lstplc);
		if(i>0) {
			System.out.println("added placed stud entry");
			response.sendRedirect("placedconfirm.jsp");
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
