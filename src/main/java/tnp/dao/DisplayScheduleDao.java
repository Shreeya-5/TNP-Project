package tnp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import tnp.model.*;
import tnp.model.Schedule;



public class DisplayScheduleDao {
	public List<Schedule> getAllSchedule(){
		List<Schedule> lst=new LinkedList<>();
		Connection con=DataSource.getConnection();
		 try {
			 Statement s=con.createStatement();
			 ResultSet rs=s.executeQuery("select * from schedule");
			 
			 while(rs.next()) {
				 Schedule se=new Schedule();
				 se.setCmpname(rs.getString(1));
				 se.setComingdate(rs.getString(2));
				 se.setTime(rs.getString(3));
				 se.setModeofprocess(rs.getString(4));
				 se.setEvent(rs.getString(5));
				 se.setBranch(rs.getString(6));
				 se.setCgpa(rs.getDouble(7));
				 se.setStiphend(rs.getInt(8));
				 se.setLocation(rs.getString(9));
				 lst.add(se);
			 }		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 return lst;
	 }
}
