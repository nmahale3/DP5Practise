package day21.ArrayasofObject;

import java.util.Scanner;

public class StudentByGetterSetter {

	public static void showByMethod(StudentTest sarr[])
	{
		StudentTest st[]= new StudentTest[3];
		System.out.println("Enter Data fromstudent array");
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < st.length; i++) {
		st[i]=new StudentTest();
		
		System.out.println("Enter roll number");
		st[i].setRollno(s.nextInt());
		
		System.out.println("Enter Name");
		st[i].setName(s.next());
		
		System.out.println("Enter Marks");
		st[i].setMarks(s.nextDouble());
		}
		
		System.out.println("--------------Display-------------");
		for(StudentTest s1:st)
		{
			System.out.println(s1);
		}
		
	}
	
	public static void main(String[] args) {
		
		StudentTest st[]= new StudentTest[3];
//		System.out.println("Enter Data fromstudent array");
//		Scanner s = new Scanner(System.in);
//		
//		for (int i = 0; i < st.length; i++) {
//		st[i]=new StudentTest();
//		
//		System.out.println("Enter roll number");
//		st[i].setRollno(s.nextInt());
//		
//		System.out.println("Enter Name");
//		st[i].setName(s.next());
//		
//		System.out.println("Enter Marks");
//		st[i].setMarks(s.nextDouble());
//		}
//		
//		System.out.println("--------------Display-------------");
//		for(StudentTest s1:st)
//		{
//			System.out.println(s1);
//		}
		
		showByMethod(st);
	}
}
