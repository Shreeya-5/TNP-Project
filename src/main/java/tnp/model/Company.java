package tnp.model;

public class Company {
	private String cmpname;
	private String website;
	private String cmpadd;
	private String mode;
	private String onlitesttimedate;
	private String interviewtimedate;
	private String natureofjob;
	private String location;
	private String branches;
	private String internshipdur;
	private double eligibility;
	private double stiphend;
	private String selectionproc;
	
	
	public Company() {
		
	}


	public Company(String cmpname, String website, String cmpadd, String mode, String onlitesttimedate,
			String interviewtimedate, String natureofjob, String location, String branches, String internshipdur,
			double eligibility, double stiphend, String selectionproc) {
		super();
		this.cmpname = cmpname;
		this.website = website;
		this.cmpadd = cmpadd;
		this.mode = mode;
		this.onlitesttimedate = onlitesttimedate;
		this.interviewtimedate = interviewtimedate;
		this.natureofjob = natureofjob;
		this.location = location;
		this.branches = branches;
		this.internshipdur = internshipdur;
		this.eligibility = eligibility;
		this.stiphend = stiphend;
		this.selectionproc = selectionproc;
	}


	public String getCmpname() {
		return cmpname;
	}


	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getCmpadd() {
		return cmpadd;
	}


	public void setCmpadd(String cmpadd) {
		this.cmpadd = cmpadd;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public String getOnlitesttimedate() {
		return onlitesttimedate;
	}


	public void setOnlitesttimedate(String onlitesttimedate) {
		this.onlitesttimedate = onlitesttimedate;
	}


	public String getInterviewtimedate() {
		return interviewtimedate;
	}


	public void setInterviewtimedate(String interviewtimedate) {
		this.interviewtimedate = interviewtimedate;
	}


	public String getNatureofjob() {
		return natureofjob;
	}


	public void setNatureofjob(String natureofjob) {
		this.natureofjob = natureofjob;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getBranches() {
		return branches;
	}


	public void setBranches(String branches) {
		this.branches = branches;
	}


	public String getInternshipdur() {
		return internshipdur;
	}


	public void setInternshipdur(String internshipdur) {
		this.internshipdur = internshipdur;
	}


	public double getEligibility() {
		return eligibility;
	}


	public void setEligibility(double eligibility) {
		this.eligibility = eligibility;
	}


	public double getStiphend() {
		return stiphend;
	}


	public void setStiphend(double stiphend) {
		this.stiphend = stiphend;
	}


	public String getSelectionproc() {
		return selectionproc;
	}


	public void setSelectionproc(String selectionproc) {
		this.selectionproc = selectionproc;
	}
	
}
