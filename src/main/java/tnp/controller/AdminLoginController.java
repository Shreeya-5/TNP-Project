package tnp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tnp.dao.StudRegDao;
import tnp.model.AdminLogin;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  static int logincnt=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String password=request.getParameter("pass");
		
		AdminLogin adminlg=new AdminLogin(uname,password);
		List<AdminLogin> lstlogin=new ArrayList<>();
		lstlogin.add(adminlg);
		
		StudRegDao stddao=new StudRegDao();
		boolean b=stddao.validateAdminData(lstlogin);
		
		if(b==true) {
			response.sendRedirect("AdminHome.jsp");
		}
		else {
			logincnt++;
				if(logincnt<3) {
					response.sendRedirect("AdminLogin.jsp");
					
				}
				else {
					response.sendRedirect("Block.jsp");
				}
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
