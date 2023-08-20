package com.tq.day15.finalkeyword;

class Os{
	public void coding()
	{
		System.out.println("Parent operating system coding");
	}
	public final void coding1()
	{
		System.out.println("Parent final operating system coding");
	}
}

class Windows extends Os{
	@Override
	public void coding()
	{
		System.out.println("Child operating system coding");
	}
//	@Override
//	public final void Coding1()
//	{
//		System.out.println("AAAAA");
//	}
//}
//we cant override if the method is final
}
public class Test2 {
	
	public static void main(String[] args) {
		
	}

}
