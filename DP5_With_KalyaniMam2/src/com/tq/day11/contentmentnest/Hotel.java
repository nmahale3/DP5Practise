package com.tq.day11.contentmentnest;


class Item{

	int iId;
	String iName;
	int iPrice;

	Item(int iId,String iName,int iPrice)
	{
		this.iId=iId;
		this.iName=iName;
		this.iPrice=iPrice;
	}
	
	public int getIId()
	{
		return iId;
	}
	
	public String getIName()
	{
		return iName;
	}
	
	public int getIPrice()
	{
		return iPrice;
	}
}


class Menu{
	private int mId;
	private String mName;
	private Item mItem;

	public int getMId()
	{
		return mId;
		
	}

	public void setMId(int id)
	{
		mId=id;
	}

	public String getMName()
	{
		return mName;
	}

	public void setMName(String name)
	{
		mName=name;
	}

	public Item getMItem()
	{
		return mItem;
		
	}

	public void setMItem(Item item)
	{
		mItem=item;
	}

//	public String toString()
//	{
//		return "Menu Id : "+mId+" Menu Name : "+mName+" Menu Item : "+mItem+" ";
//	}
}
public class Hotel {

	private int hId;
	private String hName;
	private Menu hMenu;

	public void  setHId(int id)
	{
		hId=id;
	}
	public int getHId()
	{
		return hId;
	}

	public void  setHName(String name)
	{
		hName=name;
	}
	public String getHName()
	{
		return hName;
	}

	public void  setHMenu(Menu menu)
	{
		hMenu=menu;
	}
	public Menu getHMenu()
	{
		return hMenu;
	}

//	public String toString()
//	{
//		return "Hotel Id : "+hId+" Hotel Name : "+hName+" Hotel Menu :"+hMenu+" ";
//	}


	public static void main(String[] args)
	{
		Hotel ht= new Hotel();
		ht.setHId(1001);
		ht.setHName("Oberoi");
		ht.setHMenu(new Menu ());
		
		System.out.println("Hotel ID : "+ht.getHId()+" Hotel Name : "+ht.getHName()+"");
		Menu mn = ht.getHMenu();
		mn.setMId(12);
		mn.setMName("Maharashtrian");
		mn.setMItem(new Item(123,"Misal",700));
		System.out.println("Menu ID : "+ht.getHMenu().getMId()+" Hotel Menu : "+ht.getHMenu().getMName());
		System.out.println("Item ID : "+mn.getMItem().getIId()+" Item Name : "+mn.getMItem().getIName()+" Item ID : "+mn.getMItem().getIPrice());
		
//		System.out.println("Menu Id :"+mn.getMId()+" Menu Name : "+mn.getMName()+" Menu Item : "+mn.getMItem()+" ");
		
	}

}
