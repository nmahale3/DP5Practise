package day17.interfaces;
/*2.Write a program to create interface named test. 
 * In this interface the member function is square.
 * Implement this interface in arithmetic class. 
 * Create one new class called ToTestInt
 * in this class use the object of arithmetic class.
 */
//Test interface
interface Test 
{
	 int x = 10;
	int square(int num);
}

//Arithmetic class implementing the Test interface
class Arithmetic implements Test 
{
	int x;
	@Override
	public int square(int num)
	{
		System.out.println(Test.x);
		int sqr = num*num;
		return sqr;
	}
}

public class Program2 
{
	//ToTestInt class using the object of Arithmetic class
	class ToTestInt 
	{
		public static void main(String[] args) 
		{
			Arithmetic arithmetic = new Arithmetic();
			int number = 5;
			int result = arithmetic.square(number);
			System.out.println("Square of " + number + " is: " + result);
		}
	}
}


