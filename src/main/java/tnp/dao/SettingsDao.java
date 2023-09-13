package tnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SettingsDao {

	public boolean changeCGPA(String update, String cno) {
		boolean b=false;
		int i;
		Connection con = DataSource.getConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("update studreg set cgpa=? where cno=?");
			pstate.setString(2, cno);
			pstate.setString(1, update);
			i=pstate.executeUpdate();
			if(i>0) {
				b=true;
				System.out.println("Record Updated...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return b;
	}

	public boolean changeMobno(String update, String cno) {
		boolean b=false;
		int i;
		Connection con = DataSource.getConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("update studreg set mobno=? where cno=?");
			pstate.setString(2, cno);
			pstate.setString(1, update);
			i=pstate.executeUpdate();
			if(i>0) {
				b=true;
				System.out.println("Record Updated...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return b;
	}

	public boolean changePass(String update, String cno) {
		boolean b=false;
		int i;
		Connection con = DataSource.getConnection(                                                                                                             );
		try {
			PreparedStatement pstate=con.prepareStatement("update studreg set password=? where cno=?");
			pstate.setString(2, cno);
			pstate.setString(1, update);
			i=pstate.executeUpdate();
			if(i>0) {
				b=true;
				System.out.println("Record Updated...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return b;
	}



}
