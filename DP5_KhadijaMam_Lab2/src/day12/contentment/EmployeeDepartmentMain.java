package day12.contentment;

public class EmployeeDepartmentMain {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(111);
		e.setName("Navin");
		System.out.println("Emp Id : "+e.getId()+" Employee Name : "+e.getName()+" "+e.getDept());
		e.setDept(new Department());
      
		Department d=e.getDept();
		d.setDeptId(3421);
		d.setDeptName("Reasearch & Development");
		d.setDeptSalary(80000);
	
		System.out.println("Dept Id : "+e.getDept().getDeptId()+" Dept Name : "+e.getDept().getDeptName()+" Dept Salary : "+e.getDept().getDeptSalary());


	}

}
