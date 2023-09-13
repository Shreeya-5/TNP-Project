package tnp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tnp.dao.SettingsDao;
import tnp.dao.StudRegDao;
import tnp.model.StudLogin;
import tnp.model.StudRegister;

/**
 * Servlet implementation class StudMobUpdController
 */
@WebServlet("/SettingsController")
public class SettingsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SettingsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cno=request.getParameter("cno");
		String pass=request.getParameter("password");

		StudLogin lobj = new StudLogin(cno, pass);

		List<StudLogin> lstlogin = new ArrayList<StudLogin>();
		lstlogin.add(lobj);

		StudRegDao regdao = new StudRegDao();
		List<StudRegister> lstreg = regdao.validateData(lstlogin);
		StudRegister r = lstreg.get(0);

		String update = request.getParameter("update");
		SettingsDao udao = new SettingsDao();
		String options=request.getParameter("options");
		if(options.equals("cgpa"))
		{
			boolean b = udao.changeCGPA(update, r.getCno());
			if(b) {
				response.sendRedirect("ConfirmCGPAupdate.jsp");
			}
			else {
				response.sendRedirect("Error.jsp");
			}
		}
		else if(options.equals("mobno"))
		{
			boolean b = udao.changeMobno(update, r.getCno());
			if(b) {
				response.sendRedirect("ConfirmCGPAupdate.jsp");
			}
			else {
				response.sendRedirect("Error.jsp");
			}		
		}
		else if(options.equals("pass"))
		{
			boolean b = udao.changePass(update, r.getCno());
			if(b) {
				response.sendRedirect("ConfirmCGPAupdate.jsp");
			}
			else {
				response.sendRedirect("Error.jsp");
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
