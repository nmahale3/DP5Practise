package day17.interfaces;
/*
 * 4.	 Write a Java program to create an interface Playable
 *  with a method play() that takes no arguments and returns void. 
 * Create three classes Football, Volleyball, and Basketball 
 * that implement the Playable interface 
 * and override the play() method to play the respective sports.
 */

interface Playable 
{
	void play();	
}
class Football implements Playable
{
	@Override
	public void play() 
	{
		System.out.println("Players Playing Football");	
	}
}
class Volleyball implements Playable
{
	@Override
	public void play() 
	{
		System.out.println("Players Playing Volleyball");	
	}
}
class Basketball implements Playable
{
	@Override
	public void play() 
	{
		System.out.println("Players Playing Basketball");	
	}
}

public class Program4 {

	public static void main(String[] args) {
	
		
		Football f = new Football();
		Volleyball v = new Volleyball();
		Basketball b = new Basketball();

		f.play();
		v.play();
		b.play();
		
	}

}
