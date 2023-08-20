package com.tq.day11.contentmentnest;


class Hotel1
{
	private int hid;
	private String hname;
	private Menue m;
	
	public int getHid() 
	{
		return hid;
	}
	public void setHid(int hid) 
	{
		this.hid = hid;
	}
	public String getHname() 
	{
		return hname;
	}
	public void setHname(String hname) 
	{
		this.hname = hname;
	}
	public Menue getM() 
	{
		return m;
	}
	public void setM(Menue m) 
	{
		this.m = m;
	}
	
}

class Menue
{
	private int mid;
	private String mname;
	private Item1 i;

	public int getMid() 
	{
		return mid;
	}
	public void setMid(int mid) 
	{
		this.mid = mid;
	}
	public String getMname() 
	{
		return mname;
	}
	public void setMname(String mname) 
	{
		this.mname = mname;
	}
	public Item1 getI() 
	{
		return i;
	}
	public void setI(Item1 i) 
	{
		this.i = i;
	}

}

class Item1
{
	private int iid;
	private String Iname;
	private int iprice;
	
	public int getIid() 
	{
		return iid;
	}
	public void setIid(int iid)  
	{
		this.iid = iid;
	}
	public String getIname() 
	{
		return Iname;
	}
	public void setIname(String iname) 
	{
		Iname = iname;
	}
	public int getIprice() 
	{
		return iprice;
	}
	public void setIprice(int iprice) 
	{
		this.iprice = iprice;
	}
	
}

public class Hotel2
{

	public static void main(String[] args) 
	{
		Hotel1 h=new Hotel1();
		h.setHid(10);
		h.setHname("SAYAJI");
		h.setM(new Menue());
		System.out.println("Hotel Name: "+h.getHname()+" Hotel ID: "+h.getHid());
		
		Menue m=h.getM();
		m.setMid(123);
		m.setMname("Italian");
		m.setI(new Item1());
		System.out.println("Menu Name: "+h.getM().getMname()+" Menu ID: "+h.getM().getMid());
	
		Item1 it=m.getI();
		it.setIid(12);
		it.setIname("Chawmin");
		it.setIprice(1500);
		System.out.println("Item ID: "+m.getI().getIid()+" Item Name:"+m.getI().getIname()+" Item Price: "+m.getI().getIprice());
				

	}

}