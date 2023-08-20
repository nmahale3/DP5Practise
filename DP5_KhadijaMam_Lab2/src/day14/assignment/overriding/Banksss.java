package day14.assignment.overriding;
/* 7.	Create class Bank(super)having getInterest() method returning interest.
 * create any three child classes like sbi,icici,axis and override method in respective class
 */
class Bank{
	
	double getInterest()
	{
		double interest=7.85;
		return interest;
	}
	public void show()
	{
		System.out.println("Bank Interest:\t"+getInterest());
	}
}

class SBI_Bank extends Bank {
	@Override
	double getInterest()
	{
		double interest=8.5;
		return interest;
	}
	@Override
	public void show()
	{
		super.show();
		System.out.println("SBI Bank Interest:\t"+getInterest());
	}
}

class ICICI_Bank extends Bank {
	
	@Override
	double getInterest()
	{
	
		double interest=10;
		return interest;
	}
	@Override
	public void show()
	{
		super.show();
		System.out.println("ICICI_Bank Interest:\t"+getInterest());
	}
	
}

class AXIS_Bank extends Bank {
	@Override
	double getInterest()
	{
		double interest=10.50;
		return interest;
	}
	@Override
	public void show()
	{
		super.show();
		System.out.println("AXIS_Bank Interest:\t"+getInterest());
	}
}
public class Banksss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		b.show();
		System.out.println("__________________________");
		b=new SBI_Bank();
		b.show();
		System.out.println("__________________________");
		b=new AXIS_Bank();
		b.show();
		System.out.println("__________________________");
		b=new ICICI_Bank();
		b.show();
		System.out.println("__________________________");
	}

}
