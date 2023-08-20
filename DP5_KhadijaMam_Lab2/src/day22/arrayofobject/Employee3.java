package day22.arrayofobject;

public class Employee3 {

	int id;
	String name;
	double salary;
	
	MyDate3 joiningDate;
	public Employee3(int id, String name, double salary, MyDate3 joiningDate) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
		
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public MyDate3 getJoiningDate() {
		return joiningDate;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setJoiningDate(MyDate3 joiningDate) {
		this.joiningDate = joiningDate;
	}


	@Override
	public String toString() {
		return "Employee id:\t" + id + "\nEmployee name:\t" + name + "\nEmployee salary:\t" + salary + "\n" + joiningDate + " ";
	}
	
	
}
