package com.jdbcwithcollection;

public class Student {
	
	private int sid;
	private String s_firstname;
	private String s_lastname;
	private String s_dob;
	private String s_gender;
	private String s_email;
	private long s_contact;
	private String s_degree;
	private int s_totalmarks;
	
	public Student(int sid, String s_firstname, String s_lastname, String s_dob, String s_gender, String s_email,
			long s_contact, String s_degree, int s_totalmarks) {
		super();
		this.sid = sid;
		this.s_firstname = s_firstname;
		this.s_lastname = s_lastname;
		this.s_dob = s_dob;
		this.s_gender = s_gender;
		this.s_email = s_email;
		this.s_contact = s_contact;
		this.s_degree = s_degree;
		this.s_totalmarks = s_totalmarks;
	}
	
	public Student() {
		super();
	}

	public int getSid() {
		return sid;
	}
	public String getS_firstname() {
		return s_firstname;
	}
	public String getS_lastname() {
		return s_lastname;
	}
	public String getS_dob() {
		return s_dob;
	}
	public String getS_gender() {
		return s_gender;
	}
	public String getS_email() {
		return s_email;
	}
	public long getS_contact() {
		return s_contact;
	}
	public String getS_degree() {
		return s_degree;
	}
	public int getS_totalmarks() {
		return s_totalmarks;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setS_firstname(String s_firstname) {
		this.s_firstname = s_firstname;
	}
	public void setS_lastname(String s_lastname) {
		this.s_lastname = s_lastname;
	}
	public void setS_dob(String s_dob) {
		this.s_dob = s_dob;
	}
	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}
	public void setS_contact(long s_contact) {
		this.s_contact = s_contact;
	}
	public void setS_degree(String s_degree) {
		this.s_degree = s_degree;
	}
	public void setS_totalmarks(int s_totalmarks) {
		this.s_totalmarks = s_totalmarks;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", s_firstname=" + s_firstname + ", s_lastname=" + s_lastname + ", s_dob="
				+ s_dob + ", s_gender=" + s_gender + ", s_email=" + s_email + ", s_contact=" + s_contact + ", s_degree="
				+ s_degree + ", s_totalmarks=" + s_totalmarks + "]";
	}
	
	
	
	

}
