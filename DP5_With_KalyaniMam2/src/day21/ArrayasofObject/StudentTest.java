package day21.ArrayasofObject;

public class StudentTest {
  
	
	private int rollno;
	private String name;
	private double marks;
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public StudentTest()
	{
		
	}
	public StudentTest(int rollno, String name, double marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

//	public void display() {
//		System.out.println("Roll number:\t"+rollno);
//		System.out.println("Name:\t"+name);
//		System.out.println("Marks:\t"+marks);
//	}
	
	@Override
	public String toString() {
		return "StudentTest [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
