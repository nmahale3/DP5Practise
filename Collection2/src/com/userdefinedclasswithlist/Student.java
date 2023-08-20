package com.userdefinedclasswithlist;

public class Student {

	private int sid;
	private String sname;
	private double smarks;
	public Student(int sid, String sname, double smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	
	public void show()
	{
		System.out.println("Student Id: "+sid+" Name: "+sname+" Marks: ");
	}
	
	
}
