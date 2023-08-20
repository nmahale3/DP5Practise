package com.tq.day14.overridingiheritance;

class Person
{
	protected String name;
	protected int age;
	protected String email;
	protected String mobileNumber;

	public Person(String name , int age, String email,String mobileNumber)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		this.mobileNumber=mobileNumber;
	}

	public void show()
	{
		System.out.println("Name\t:" +name);
		System.out.println("age\t:" +age);
		System.out.println("email\t:" +email);
		System.out.println("mobileNumber\t:" +mobileNumber);
	}

}
class Teacher extends Person{
	double salary;
	String degree;
	public Teacher(String name, int age, String email, String mobileNumber,String degree,double salary) 
	{
		super(name, age, email, mobileNumber);
		this.degree=degree;
		this.salary=salary;
	}



	public void show()
	{
		super.show();
		System.out.println("Degree\t:" +degree);
		System.out.println("Salary\t:" +salary);

	}
	
}



public class Test {

	public static void main(String[] args)
	{
		Person p = new Person("Navin",	26,	"nmahale3@gmail.com", "7620753076");
		p.show();
		System.out.println("--------------------------------------------------");
		Teacher t = new Teacher("Nikita mam",	33,	"nikitamoretq@gmail.com", "7643786852","Sr. Software Engineer",67000);
		t.show();
	}

}
