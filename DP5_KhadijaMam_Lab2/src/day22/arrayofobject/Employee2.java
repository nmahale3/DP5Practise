package day22.arrayofobject;


public class Employee2 {
    private int id;
    private String name;
    private double salary;
    private Department2 department;

    public Employee2(int id, String name, double salary, Department2 department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
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

	public void setDepartment(Department2 department) {
		this.department = department;
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

    public Department2 getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }
}

 

