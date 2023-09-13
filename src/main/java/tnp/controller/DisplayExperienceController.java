package tnp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tnp.dao.DisplayExperience;
import tnp.dao.DisplayPlacedDao;
import tnp.model.Experience;
import tnp.model.Placed;

/**
 * Servlet implementation class DisplayExperience
 */
@WebServlet("/DisplayExperience")
public class DisplayExperienceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayExperienceController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DisplayExperience disexpdao=new DisplayExperience();
		List<Experience> lstexp=disexpdao.getAllExp();
		HttpSession session=request.getSession();
		session.setAttribute("explist", lstexp);
		if(lstexp!=null) {
			Experience e=lstexp.get(0);
			System.out.println(e.getCmpname()+"\t"+e.getCno());
			
			response.sendRedirect("ExpList.jsp");
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
