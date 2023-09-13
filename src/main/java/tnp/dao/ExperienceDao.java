package tnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import tnp.model.*;

public class ExperienceDao {
	 public int Create(List<Experience> lstexp) {
		 int i=0;
		 Experience e1=lstexp.get(0);
		 Connection con=DataSource.getConnection();
		 try {
			PreparedStatement pstate=con.prepareStatement("insert into experience values(?,?,?,?)");
			pstate.setString(1,e1.getSname());
			pstate.setString(2,e1.getCno());
			pstate.setString(3,e1.getCmpname());
			pstate.setString(4,e1.getExp());
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
