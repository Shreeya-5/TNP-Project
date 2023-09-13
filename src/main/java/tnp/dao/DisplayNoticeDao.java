package tnp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import tnp.model.*;

public class DisplayNoticeDao {
	public List<NoticeM> getAllNotice(){
		List<NoticeM> lst=new LinkedList<>();
		Connection con=DataSource.getConnection();
		 try {
			 Statement s=con.createStatement();
			 ResultSet rs=s.executeQuery("select *from notice");
			 
			 while(rs.next()) {
				 NoticeM n=new NoticeM();
				n.setNoticeno(rs.getInt(1));
				n.setNoticesent(rs.getString(2));
				 lst.add(n);
			 }
			 }
		 catch (SQLException e) {
			
			e.printStackTrace();
		}
		 return lst;
	}
}
