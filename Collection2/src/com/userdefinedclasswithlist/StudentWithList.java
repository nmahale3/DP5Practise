package com.userdefinedclasswithlist;
import java.util.*;
public class StudentWithList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> slist =new  ArrayList<Student>() ;
		slist.add(new Student(101,"Rushikesh",80));
		slist.add(new Student(102,"Navin",85));
		slist.add(new Student(103,"Subodh",84));
		slist.add(new Student(104,"Saurabh",87));
		slist.add(new Student(105,"Bhagyesh",79));
		slist.add(new Student(106,"Rakesh",80));
		
//		System.out.println("------------Student List------------");
//		System.out.println(slist);
		
//		System.out.println("------------Student List with toString() ------------");
//		for (int i = 0; i < slist.size(); i++) {
//			System.out.println(slist.get(i));
//		}
		
//		System.out.println("------------Student List without toString() ------------");
//		for (int i = 0; i < slist.size(); i++) {
//			Student s=slist.get(i);
//			s.show();
//		}
		
		
//		System.out.println("------------Student List with Setter getter ------------");
//		for (int i = 0; i < slist.size(); i++) {
//			Student s=slist.get(i);
//			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSmarks());
//		}
	
//		System.out.println("------------Student List with for-each Loop ------------");
//		for (Student s : slist) {
//			System.out.println(s);
//		}
		
		System.out.println("------------Student List with Iterator ------------");
		Iterator<Student> ster=slist.iterator();
		while (ster.hasNext()) {
//		System.out.println(ster.next());
		Student s=ster.next();
		System.out.println(s);
		}
		
		/*
		 * System.out.println("-----------Find Particular Student-----------"); //
		 * System.out.println("-----------Enter Student name-----------"); String
		 * studentName=sc.next(); for (int i = 0; i < slist.size(); i++) { Student s=
		 * slist.get(i); // if(s.getSname()=="Subodh")
		 * 
		 * if(s.getSname().equals(studentName)) {
		 * System.out.println(studentName+" is Present"); break; } else {
		 * System.out.println(studentName+" is not Present"); break; }
		 * 
		 * 
		 * }
		 */
		System.out.println("-----------Find Particular Student-----------");
		System.out.println("-----------Enter Student Id-----------");
		int studentId=sc.nextInt();
		for (int i = 0; i < slist.size(); i++) {
			Student s= slist.get(i);
			if(s.getSid()>=studentId)
			{
				System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSmarks());
				
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
