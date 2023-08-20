package com.tq.day9.accessmodifiers;

public class Student {
	
	private int id ;
	private String name;
	private int marks;
	private boolean b;
	
	
	public void setB(boolean b)
	{
		this.b=b;
	}
	public boolean getB()
	{
		return isB();
	}
	
	public void setID(int id)
	{
		this.id=id;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}

	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMarks()
	{
		return marks;
	}
	public boolean isB() {
		return b;
	}
}
