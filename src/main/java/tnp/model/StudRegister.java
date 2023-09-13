package tnp.model;

public class StudRegister {
	private String sname;
	private String cno;
	private String semail;
	private String mobno;
	private String saddress;
	private int graduyear;
	private String branch;
	private double cgpa;
	private String password;
	
	public StudRegister() {
		
	}
	public StudRegister(String sname, String cno, String semail, String mobno, String saddress, int graduyear,
			String branch, double cgpa, String password) {
		super();
		this.sname = sname;
		this.cno = cno;
		this.semail = semail;
		this.mobno = mobno;
		this.saddress = saddress;
		this.graduyear = graduyear;
		this.branch = branch;
		this.cgpa = cgpa;
		this.password = password;
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

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public int getGraduyear() {
		return graduyear;
	}

	public void setGraduyear(int graduyear) {
		this.graduyear = graduyear;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}