package tnp.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import tnp.model.*;
import tnp.dao.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tnp.model.StudRegister;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname=request.getParameter("sname");
		String cno=request.getParameter("cno");
		String semail=request.getParameter("semail");
		String mobno=request.getParameter("mobno");
		String saddress=request.getParameter("saddress");
		int  graduyear=Integer.parseInt(request.getParameter("graduyear"));
		String branch=request.getParameter("branch");
		double cgpa=Double.parseDouble(request.getParameter("cgpa"));
		String password=request.getParameter("password");
		
		StudRegister studmodel=new StudRegister(sname,cno,semail,mobno,saddress,graduyear,branch,cgpa,password);
		List<StudRegister> lstsreg=new LinkedList<>();
		lstsreg.add(studmodel);
		StudRegDao studdao=new StudRegDao();
		int i=studdao.Create(lstsreg);
		if(i>0) {
			System.out.println("inserted successfully..");
			response.sendRedirect("StudLogin.jsp");
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
