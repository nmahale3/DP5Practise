package com.tq.day11.contentmentnest;

class Address{
	
	String city;
	int pincode;
	
	
	public void setCity(String city)
	{
		this.city =city;
	}
	public String getCity()
	{
		return city;
	}
	
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public int getPincode()
	{
		return pincode;
	}
}

public class PersonGS 
{
	private int pid;
	private String pname;
	private Address address;
	
	
	public void setPid(int pid)
	{
		this.pid=pid;		
	}
	public int getPid()
	{
		return pid;
	}
	
	public void setPname(String pname) 
	{
		this.pname=pname;
	}
	public String getPname()
	{
		return pname;
	}
	
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public Address getAddress()
	{
		return address;
	}

	
	public static void main (String []args)
	{
		
		PersonGS gs = new PersonGS();
		gs.setPid(123);
		gs.setPname("Navin");
		gs.setAddress(new Address());
		
		Address ads=gs.getAddress();
		ads.setCity("Surat");
		ads.setPincode(394210);
		
		System.out.println("Person id: "+gs.getPid()+" Person Name: "+gs.getPname()+" Person City: "+gs.getAddress().getCity()+" City Pincode: "+gs.getAddress().getPincode());
	}
}

