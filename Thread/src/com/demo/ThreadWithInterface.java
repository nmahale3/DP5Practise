package com.demo;


class MyT implements Runnable
{
	public void run()
	{
		System.out.println("Thread Running"+Thread.currentThread().getName());
	}
}



public class ThreadWithInterface {
	
	public static void main(String[] args)
	{
	MyT mt = new MyT();
	Thread t1=new Thread(mt);//Without using Thread class and use it inside 
	Thread t2=new Thread(mt);//creating object in main method by runnable parameter in constructor

	t1.start();
	t2.start();

	}
}