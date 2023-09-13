package tnp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import tnp.model.*;

import tnp.model.*;

public class DisplayCompanyDao {
	public List<Company> getAllCompany(){
		List<Company> lst=new LinkedList<>();
		Connection con=DataSource.getConnection();
		 try {
			 Statement s=con.createStatement();
			 ResultSet rs=s.executeQuery("select *from company");
			 
			 while(rs.next()) {
				 Company cobj=new Company();
				cobj.setCmpname(rs.getString(1));
				cobj.setWebsite(rs.getString(2));
				cobj.setCmpadd(rs.getString(3));
				cobj.setMode(rs.getString(4));
				cobj.setOnlitesttimedate(rs.getString(5));
				cobj.setInterviewtimedate(rs.getString(6));
				cobj.setNatureofjob(rs.getString(7));
				cobj.setLocation(rs.getString(8));
				cobj.setBranches(rs.getString(9));
				cobj.setInternshipdur(rs.getString(10));
				cobj.setEligibility(rs.getDouble(11));
				cobj.setStiphend(rs.getDouble(12));
				cobj.setSelectionproc(rs.getString(13));
				 lst.add(cobj);
			 }		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return lst;
	 }
}
