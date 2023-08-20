package day17.interfaces;
/*5.Write a Java program to create an interface Flyable with a method called fly_obj().
 * Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. 
 * Implement the fly_obj() method for each of the three classes.
 */

interface Flyable
{
	 void flyObj();
	 
}
class Spacecraft implements Flyable
{
	@Override
	public void flyObj() 
	{
	System.out.println("Spacecraft is flying in outer space.");	
	}	
}
class Airplane implements Flyable
{
	@Override
	public void flyObj() 
	{
		System.out.println("Airoplane is flying in Sky.");
	}	
}
class Helicopter implements Flyable

{
	@Override
	public void flyObj() 
	{
		System.out.println("Helicopter is flying in the air.");
	}	
}
public class Program5 {

	public static void main(String[] args) {
	Airplane a = new Airplane();
	a.flyObj();
	
	Helicopter h = new Helicopter();
	h.flyObj();
	
	Spacecraft s = new Spacecraft();
	s.flyObj();

	}

}
