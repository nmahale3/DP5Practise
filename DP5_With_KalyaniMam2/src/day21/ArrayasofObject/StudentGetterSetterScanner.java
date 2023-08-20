package day21.ArrayasofObject;

import java.util.Scanner;

public class StudentGetterSetterScanner {

	static Scanner sc = new Scanner(System.in);

	public static void studentAdd(StudentTest s) {
		System.out.println("Enter roll number");
		s.setRollno(sc.nextInt());

		System.out.println("Enter Name");
		s.setName(sc.next());

		System.out.println("Enter Marks");
		s.setMarks(sc.nextDouble());
	}

	private static void showStudent(StudentTest s12[]) {
		for (StudentTest st : s12) {
			System.out.println(st);
		}
	}

	public static void main(String[] args) {

		StudentTest st[] = new StudentTest[3];
		for (int i = 0; i < st.length; i++) {
			st[i] = new StudentTest();
			studentAdd(st[i]);
		}
		showStudent(st);
	}

}
