package tnp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import tnp.model.NoticeM;
import tnp.model.Placed;

public class DisplayPlacedDao {
	public List<Placed> getAllPlaced(){
		List<Placed> lst=new LinkedList<>();
		Connection con=DataSource.getConnection();
		 try {
			 Statement s=con.createStatement();
			 ResultSet rs=s.executeQuery("select *from placed");
			 
			 while(rs.next()) {
				Placed p=new Placed();
				p.setCmpname(rs.getString(1));
				p.setCno(rs.getString(2));
				 lst.add(p);
			 }
			 }
		 catch (SQLException e) {
			
			e.printStackTrace();
		}
		 return lst;
	}
}
