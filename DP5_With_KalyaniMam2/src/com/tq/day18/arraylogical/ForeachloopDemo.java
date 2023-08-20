package com.tq.day18.arraylogical;

public class ForeachloopDemo {

	public static void main(String[] args) {
		
		
		String name[]= {"NAVIN","BAGYESH","CHAITANYA","DUGGE"};
		for(String s : name)
		{
			System.out.println(s);
		}
	}
}
// Advantages - 1) no need to mention the length
//				2) no need to initialize

//Disadvantages - 1) iterates in forward direction only