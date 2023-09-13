package tnp.model;

public class Placed {
	String cmpname;
	String cno;
	
	public Placed() {
		
	}
	public Placed(String cmpname, String cno) {
		super();
		this.cmpname = cmpname;
		this.cno = cno;
	}
	public String getCmpname() {
		return cmpname;
	}
	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}

}
