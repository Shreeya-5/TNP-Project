package tnp.dao;
import tnp.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class ScheduleDao {
 public int create(List<Schedule> lstsch) {
	 int i=0;
	 Schedule sch=lstsch.get(0);
	 Connection con=DataSource.getConnection();
	 try {
		PreparedStatement pstate=con.prepareStatement("insert into schedule values(?,?,?,?,?,?,?,?,?)");
		 pstate.setString(1,sch.getCmpname());
		 pstate.setString(2,sch.getComingdate());
		 pstate.setString(3,sch.getTime());
		 pstate.setString(4,sch.getModeofprocess());
		 pstate.setString(5,sch.getEvent());
		 pstate.setNString(6, sch.getBranch());
		 pstate.setDouble(7,sch.getCgpa());
		 pstate.setDouble(8,sch.getStiphend());
		 pstate.setString(9, sch.getLocation());
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
