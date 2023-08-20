package com.linkedlist;

import java.util.LinkedList;

public class LinkedListMethods_I {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("Ram");
		list.add("Laxman");
		list.add("Sita");
		list.add("Krishna");
		list.add("Radha");
		list.add("Shankar");
		System.out.println(list);
		
		System.out.println("\nAfter adding at Oth index");
		list.addFirst("Omkar");
		System.out.println(list);
		System.out.println("\nAfter adding at last index");
		list.addLast("Gauri");
		System.out.println(list);
		
		System.out.println("\nAfter removing Oth index");
		list.removeFirst();
		System.out.println(list);
		System.out.println("\nAfter removing last index");
		list.removeLast();
		System.out.println(list);
	
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	
	}
}
