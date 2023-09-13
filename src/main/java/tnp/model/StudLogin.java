package tnp.model;

public class StudLogin {
	private String cno;
	private  String password;
	public StudLogin(String cno, String password) {
		super();
		this.cno = cno;
		this.password = password;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
