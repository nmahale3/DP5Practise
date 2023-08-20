package day22.arrayofobject;

public class EmpDeptMain {
	public static void main(String[] args) {


		Department2 mech= new Department2(101, "Mechanical");
		Department2 it = new Department2(102, "IT");
		Department2 sales = new Department2(103, "Sales");
		Department2 hr = new Department2(104, "hr");
		Employee2[] e = new Employee2[10];

		e[0] = new Employee2(1, "Jitendra Desale", 15000, it);
		
		e[1] = new Employee2(2, "Ishwar Patil", 30000, mech);
		e[2] = new Employee2(3, "Rushikes Bairagi", 30000, mech);
		e[3] = new Employee2(4, "Rushikesh Jadhav", 30000, mech);
		
		e[4] = new Employee2(5, "Devendra Patil", 25000,sales);
		e[5] = new Employee2(6, "Jitendra Patil", 30000,sales);
		e[6] = new Employee2(7, "Ganesh Patil", 35000,sales);
		
		e[7] = new Employee2(7, "Devendra Patil", 25000,hr);
		e[8] = new Employee2(8, "Jitendra Patil", 30000,hr);
		e[9] = new Employee2(9, "Ganesh Patil", 35000,hr);
		
		System.out.println(e[0].getId());
		System.out.println(e[1].getDepartment().getDname());

		// 4.for Employees which are working in sales department
		for (Employee2 em : e) {
			if(em.getDepartment().getDid()==103)
			{
				System.out.println(em);
			}
		}
	}
}
