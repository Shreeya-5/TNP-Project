package tnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import tnp.model.*;


public class AddCompanyDao {
	public int Create(List<Company> lstcmp) {
		 int i=0;
		 Company c=lstcmp.get(0);
		 Connection con=DataSource.getConnection();
		 try {
			PreparedStatement pstate=con.prepareStatement("insert into company values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstate.setString(1,c.getCmpname());
			pstate.setString(2,c.getWebsite());
			pstate.setString(3, c.getMode());
			pstate.setString(4, c.getCmpadd());
			pstate.setString(5, c.getOnlitesttimedate());
			pstate.setString(6,c.getInterviewtimedate());
			pstate.setString(7,c.getNatureofjob());
			pstate.setString(8,c.getLocation());
			pstate.setString(9,c.getBranches());
			pstate.setString(10, c.getInternshipdur());
			pstate.setDouble(11,c.getEligibility());
			pstate.setDouble(12, c.getStiphend());
			pstate.setString(13,c.getSelectionproc());
			
			 i=pstate.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 finally {
			 try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return i;
	 }
}
