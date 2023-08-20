package day17.interfaces;
/*6.Create an interface Account 
 * having methods- deposit(), withdraw() and aboutBank() (abountBank() is a static method). 
 * Create two classes Saving and Current which implement the Account interface. 
 * Call the methods of Saving and Current classes in main method.,
 * create a new method in Account interface- takeLoan() (takeLoan() is a default method).
 * takeLoan() method would be implemented by Saving class only. 
 * Call the methods of Saving and Current classes in main method. 
 */
interface Account
{
	void deposite();
	void withdraw();
	static void aboutBank() 
	{
		System.out.println("Account Interface\n====================================");
	}
	default void takeLoan()
	{
		
	}
	
}

class Saving implements Account
{
	@Override
	public void deposite() 
	{	
		System.out.println("Saving A/c Deposite Method");
	}
	@Override
	public void withdraw() 
	{
		System.out.println("Saving A/c Withdraw Method");		
	}
	public void takeLoan()
	{
		System.out.println("Saving A/c take a Loan Method\n====================================");
	}
	
}
class Current implements Account
{
	@Override
	public void deposite() 
	{	
		System.out.println("Current A/c Deposite Method");
	}
	@Override
	public void withdraw() 
	{
		System.out.println("Current A/c Withdraw Method");
	}
	
}
public class Program6 {

	public static void main(String[] args) {
			
		Account.aboutBank();//Static method calling by interfacename.methodname
		
		Saving s = new Saving();//Saving Account object calling
		s.deposite();
		s.withdraw();
		s.takeLoan();
		
		Current c = new Current();//Current Account object calling
		c.deposite();
		c.withdraw();
		
	}

}
