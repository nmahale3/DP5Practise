package day22.arrayofobject;
/*
 * 1&2. WAP to create Array of Employees and display the employee data by traversing array. 
 * Employee class has (id, name, salary)
 */
public class Employee1 {

	private int id;
	private String name;
	private double salary;

	public Employee1() {

	}

	public Employee1(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {

		Employee1[] emp = new Employee1[3];


		emp[0] = new Employee1(101, "Navin", 10000);
		emp[1] = new Employee1(102, "Chaitanya", 12000);
		emp[2] = new Employee1(103, "Bhagyesh", 15000);

		// traversing the array
		System.out.println("---------All Employees---------");
		for (Employee1 e : emp) {
			System.out.println(e);
		}

		System.out.println("---------Employees having Salary >10000---------");
		for (Employee1 e : emp) {
			if(e.getSalary()>10000)
			{
				System.out.println(e);
			}
		}

	}

}
