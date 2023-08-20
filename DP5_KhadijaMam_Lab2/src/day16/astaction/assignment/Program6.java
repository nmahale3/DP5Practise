package day16.astaction.assignment;
abstract /*6) A company has employees 
 * and wants to keep a track of their names, id and hours of work.
 * The employees are specifically categorised into part-time and full-time.
 * Salary needs to be calculated for both however,
 * where part-time employees get 200 rs. Per hour and 
 * Full-time employees get 500 rs. per hour. 
 * Write a program which does the same.
 * */

class Company
{
	protected String eName;
	protected int eId;
	protected int eWorkHour;
	public Company(String eName, int eId, int eWorkHour) 
	{
		this.eName = eName;
		this.eId = eId;
		this.eWorkHour = eWorkHour;
	}
	abstract void calculateSalary();
	abstract void show();
}
class Part_Time extends Company
{
	private int salary;
	int partTimeRate=200;
	public Part_Time(String eName, int eId, int eWorkHour) 
	{
		super(eName, eId, eWorkHour);
	}
	@Override
	public void calculateSalary()
	{
		salary=partTimeRate*eWorkHour;	
	}
	@Override
	public void show()
	{
		System.out.println("Name                \t:"+eName);
	    System.out.println("EmpId               \t:"+eId);
	    System.out.println("Hourofworking       \t:"+eWorkHour);
		System.out.print("Employee Salary       \t:"+salary);
	}	
}
class Full_Time extends Company
{
	int fullTimeRate=500;
	private int salary;
	public Full_Time(String eName, int eId, int eWorkHour)
	{
		super(eName, eId, eWorkHour);		
	}
	@Override
	public void calculateSalary()
	{
		
		salary=fullTimeRate*eWorkHour;	
	}
	@Override
	public void show()
	{
		System.out.println("Name                \t:"+eName);
	    System.out.println("EmpId               \t:"+eId);
	    System.out.println("Hourofworking       \t:"+eWorkHour);
		System.out.print("Employee Salary       \t:"+salary);
	}
}
public class Program6 
{
	public static void main(String[] args) 
	{
	Company c;
	System.out.println("======Part Time=============");
	c= new Part_Time("Jitendra",4297,4);
	c.calculateSalary();
	c.show();
	
	System.out.println("\n\n======Full Time=============");
	c= new Full_Time("Navin",975802,9);
	c.calculateSalary();
	c.show();
	}
}


