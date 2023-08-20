package day21.ArrayasofObject;

public class Student2TestArrayInstanceVar {

	public static void main(String[] args) {
		Student2 s1 = new Student2("Navin", 101, new double[] { 89, 90, 84 });

		double m1[] = { 97, 56, 76 };
		double m2[] = { 96, 52, 53 };
		double m3[] = { 94, 43, 54 };
		double m4[] = { 93, 50, 60 };
		double m5[] = { 95, 65, 76 };

		Student2 s2 = new Student2("Chaitanya", 102, m2);
		Student2 s3 = new Student2("Bhagyesh", 103, m3);
		Student2 s4 = new Student2("Dugge", 104, m4);
		Student2 s5 = new Student2("Rushikesh", 105, m5);
		
		System.out.println("-----------student2----------------");
		s2.display();
		
		System.out.println("-----------student3----------------");
		s3.display();
	
		System.out.println("-----------students by toString----------------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
