package day12.contentment;

public class Employee {

	private int id;
	private String name;
	private Department dept;
	
	
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setDept(Department dept)
	{
		this.dept=dept;
	}
	public Department getDept()
	{
		return dept;
	}
//	public String toString()
//	{
//		return "Emp Id : "+id+" Employee Name : "+name+" "+dept;
//	}
	
}
