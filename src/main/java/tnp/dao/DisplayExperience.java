package tnp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import tnp.model.*;

public class DisplayExperience {
	public List<Experience> getAllExp(){
		List<Experience> lst=new LinkedList<>();
		Connection con=DataSource.getConnection();
		 try {
			 Statement s=con.createStatement();
			 ResultSet rs=s.executeQuery("select *from experience");
			 
			 while(rs.next()) {
				 Experience eobj=new Experience();
				 eobj.setSname(rs.getString(1));
				 eobj.setCno(rs.getString(2));
				 eobj.setCmpname(rs.getString(3));
				 eobj.setExp(rs.getString(4));
				 lst.add(eobj);
			 }
			 }
		 catch (SQLException e) {
			
			e.printStackTrace();
		}
		 return lst;
	}
}
