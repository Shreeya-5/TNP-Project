package tnp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


import tnp.model.*;
public class DisplayStudDao {
	public List<StudRegister> getAllStudent(){
		List<StudRegister> lst=new LinkedList<>();
		Connection con=DataSource.getConnection();
		 try {
			 Statement s=con.createStatement();
			 ResultSet rs=s.executeQuery("select *from studreg");
			 
			 while(rs.next()) {
				 StudRegister sobj=new StudRegister();
				 sobj.setSname(rs.getString(1));
				 sobj.setCno(rs.getString(2));
				 sobj.setSemail(rs.getString(3));
				 sobj.setMobno(rs.getString(4));
				 sobj.setSaddress(rs.getString(5));
				 sobj.setGraduyear(rs.getInt(6));
				 sobj.setBranch(rs.getString(7));
				 sobj.setCgpa(rs.getDouble(8));
				 sobj.setPassword(rs.getString(9));
				 lst.add(sobj);
			 }		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return lst;
	 }
}
