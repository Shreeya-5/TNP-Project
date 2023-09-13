package tnp.model;

public class NoticeM {
	private int noticeno;
	private String noticesent;
	
	public NoticeM() {
		
	}
	public NoticeM(int noticeno, String noticesent) {
		super();
		this.noticeno = noticeno;
		this.noticesent = noticesent;
	}
	public int getNoticeno() {
		return noticeno;
	}
	public void setNoticeno(int noticeno) {
		this.noticeno = noticeno;
	}
	public String getNoticesent() {
		return noticesent;
	}
	public void setNoticesent(String noticesent) {
		this.noticesent = noticesent;
	}

}
