package day10.staticdetails;

public class BankDetails {
	
	private int c_id;
	private String c_name;
	private double c_balance;
	
	
	public void setId(int id)
	{
		c_id=id;
	}
	public int getId()
	{
		return c_id;
	}	
	public void setName(String name)
	{
		c_name=name;
	}
	public String getName()
	{
		return c_name;
	}
	public void setId(double balance)
	{
		c_balance=balance;
	}
	public double getBalance()
	{
		return c_balance;
	}

}
