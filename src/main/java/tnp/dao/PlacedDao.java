package tnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import tnp.model.Placed;



public class PlacedDao {
	 public int Create(List<Placed> lstplc) {
		 int i=0;
		 Placed p=lstplc.get(0);
		 Connection con=DataSource.getConnection();
		 try {
			PreparedStatement pstate=con.prepareStatement("insert into placed values(?,?)");
			pstate.setString(1, p.getCmpname());
			pstate.setString(2,p.getCno());
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
