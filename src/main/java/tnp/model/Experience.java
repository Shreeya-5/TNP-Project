package tnp.model;

public class Experience {
	private String sname;
	private String cno;
	private String cmpname;
	private String exp;
	public Experience(String sname, String cno, String cmpname, String exp) {
		super();
		this.sname = sname;
		this.cno = cno;
		this.cmpname = cmpname;
		this.exp = exp;
	}
	public Experience() {
		
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCmpname() {
		return cmpname;
	}
	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}


}
