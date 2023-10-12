package com.demo;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thrad is running "+Thread.currentThread().getName());
	}
}


public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		mt.run();
		mt.setName("New Thread");
		
		MyThread mt2 = new MyThread();
		mt2.start();
		mt2.run();
		mt2.setName("Old Thread");
		
	}
}
