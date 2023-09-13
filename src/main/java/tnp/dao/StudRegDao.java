package tnp.dao;
import tnp.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;



public class StudRegDao {
 public int Create(List<StudRegister> lstsreg) {
	 int i=0;
	 StudRegister s=lstsreg.get(0);
	 Connection con=DataSource.getConnection();
	System.out.println(con);
	 try {
		PreparedStatement pstate=con.prepareStatement("insert into studreg values(?,?,?,?,?,?,?,?,?)");
		 pstate.setString(1,s.getSname());
		 pstate.setString(2,s.getCno());
		 pstate.setString(3,s.getSemail());
		 pstate.setString(4,s.getMobno());
		 pstate.setString(5,s.getSaddress());
		 pstate.setInt(6,s.getGraduyear());
		 pstate.setString(7,s.getBranch());
		 pstate.setDouble(8, s.getCgpa());
		 pstate.setString(9, s.getPassword());
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
 public List<StudRegister> validateData(List<StudLogin> lstlogin) {
		boolean b=false;
		StudLogin lobj=lstlogin.get(0);
		System.out.println(lobj.getCno());
		List<StudRegister> lstreg=null;
		Connection con=DataSource.getConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("select * from studreg where cno=? and password=?");
			pstate.setString(1, lobj.getCno());
			pstate.setString(2, lobj.getPassword());
			ResultSet rs = pstate.executeQuery();			
			if (rs.next()) {
				b = true;
				lstreg=new LinkedList<StudRegister>();
				StudRegister s=new StudRegister(rs.getString(1),rs.getNString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getDouble(8),rs.getString(9));
				lstreg.add(s);
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lstreg;

	}
 
 public boolean validateAdminData(List<AdminLogin> lstlogin) {
		boolean b=false;
		AdminLogin lobj=lstlogin.get(0);
		
		Connection con=DataSource.getConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("select * from admin where user_name=? and pass_word=?");
			pstate.setString(1, lobj.getUname());
			pstate.setString(2, lobj.getPassword());
			ResultSet rs = pstate.executeQuery();
			System.out.println(rs.getString(1)+" & "+rs.getString(2));
			if (rs.next()) {
				b = true;
				System.out.println(b);
			}
			System.out.println(b);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;

	}
 
 public StudRegister Search(String cno) {
	 List<StudRegister> lstreg=null;
	 Connection con=DataSource.getConnection();
	 StudRegister r=null;
	 try {
		PreparedStatement pstate=con.prepareStatement("select *from studreg where cno=?");
		 pstate.setString(1,cno);
		 ResultSet rs=pstate.executeQuery();
		 if(rs.next()) {
			 r=new StudRegister(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getFloat(8),rs.getString(9));
		 }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
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
	 return r;
 }
 
}
