package tnp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tnp.dao.DisplayCompanyDao;
import tnp.dao.DisplayStudDao;
import tnp.model.Company;
import tnp.model.StudRegister;

/**
 * Servlet implementation class DisplayCompanyController
 */
@WebServlet("/DisplayCompanyController")
public class DisplayCompanyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCompanyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DisplayCompanyDao discmpdao=new DisplayCompanyDao();
		List<Company> lst=discmpdao.getAllCompany();

//		request.setAttribute("schedlist", lst);
//		RequestDispatcher view=request.getRequestDispatcher("SchduleList.jsp");
//		view.forward(request, response);
		HttpSession session=request.getSession();
		session.setAttribute("cmplst", lst);
		if(lst!=null) {
			System.out.println("test1");
			Company c=lst.get(0);
			response.sendRedirect("CompanyList.jsp");
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
