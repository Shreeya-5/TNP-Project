package tnp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import tnp.model.*;
public class NoticeDao {
 public int Create(List<NoticeM> lstntc) {
	 int i=0;
	 NoticeM n=lstntc.get(0);
	 Connection con=DataSource.getConnection();
	 try {
		PreparedStatement pstate=con.prepareStatement("insert into notice values(?,?)");
		pstate.setInt(1, n.getNoticeno());
		pstate.setString(2,n.getNoticesent());
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
