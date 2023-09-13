package tnp.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tnp.dao.AddCompanyDao;
import tnp.model.*;
/**
 * Servlet implementation class CompanyController
 */
@WebServlet("/CompanyController")
public class CompanyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CompanyController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmpname=request.getParameter("cmpname");
		String website=request.getParameter("website");
		String cmpadd=request.getParameter("cmpadd");
		String mode=request.getParameter("mode");
		String onlitesttimedate=request.getParameter("onlitesttimedate");
		String interviewrtimedate=request.getParameter("interviewtimedate");
		String natureofjob=request.getParameter("natureofjob");
		String location=request.getParameter("location");
		String branches=request.getParameter("branches");
		String internshipdur=request.getParameter("internshipdur");
		double eligibility=Double.parseDouble(request.getParameter("elijibility"));
		double stiphend=Double.parseDouble(request.getParameter("stiphend"));
		String selectionproc=request.getParameter("selectionproc");
		
		Company cmpmodel=new Company(cmpname,website,cmpadd,mode,onlitesttimedate,interviewrtimedate,natureofjob,location,branches,internshipdur,eligibility,stiphend,selectionproc);
		List<Company> lstcmp=new LinkedList<>();
		lstcmp.add(cmpmodel);
		AddCompanyDao cmpdao=new AddCompanyDao();
		int i=cmpdao.Create(lstcmp);
		if(i>0) {
			System.out.println("Company added");
			response.sendRedirect("CompanyAdd.jsp");
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
