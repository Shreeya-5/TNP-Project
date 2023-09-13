package tnp.model;

public class Schedule {
	private String cmpname;
	private String comingdate;
	private String  time;
	private String modeofprocess;
	private String event;
	private String branch;
	private double cgpa;
	private int stiphend;
	private String location;
	
	public Schedule() {
		
	}
	public Schedule(String cmpname, String comingdate, String time, String modeofprocess, String event, String branch,
			double cgpa, int stiphend, String location) {
		super();
		this.cmpname = cmpname;
		this.comingdate = comingdate;
		this.time = time;
		this.modeofprocess = modeofprocess;
		this.event = event;
		this.branch = branch;
		this.cgpa = cgpa;
		this.stiphend = stiphend;
		this.location = location;
	}
	public String getCmpname() {
		return cmpname;
	}
	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}
	public String getComingdate() {
		return comingdate;
	}
	public void setComingdate(String comingdate) {
		this.comingdate = comingdate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getModeofprocess() {
		return modeofprocess;
	}
	public void setModeofprocess(String modeofprocess) {
		this.modeofprocess = modeofprocess;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
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
	public int getStiphend() {
		return stiphend;
	}
	public void setStiphend(int stiphend) {
		this.stiphend = stiphend;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	


}
