package day22.arrayofobject;

public class EmpDateMain {

	public static void main(String[] args) 
	{
		MyDate3 date1= new MyDate3(12, 1,2012);
		MyDate3 date2= new MyDate3(13, 3,2018);
		MyDate3 date3= new MyDate3(14, 2,2007);
		MyDate3 date4= new MyDate3(15, 4,2019);
		MyDate3 date5= new MyDate3(16, 5,2008);
		
		Employee3[] e = new Employee3[10];
		e[0]=new Employee3(121, "Rushikesh", 25000,date1);
		e[1]=new Employee3(122, "Kaushal", 20000,date2);
		e[2]=new Employee3(123, "Harshal", 28000,date3);
		e[3]=new Employee3(124, "Bhagyesh", 22000,date4);
		e[4]=new Employee3(125, "Rakesh", 23000,date5);
		e[5]=new Employee3(126, "Subodh", 28000,date5);
		e[6]=new Employee3(127, "Chaitanya", 24000,date4);
		e[7]=new Employee3(128, "Keshav", 29000,date3);
		e[8]=new Employee3(129, "Abhishek", 27000,date3);
		e[9]=new Employee3(130, "Dugge", 50000,date1);
		//Now create array of Employee 
		//and print only those Employees who joined after 2010.
		for (Employee3 em : e) 
		{
			if(em.getJoiningDate().getYear()>2010)
			{
				System.out.println(em);
				System.out.println("-------------------------------------------");
			}
			
		}
		
		
		System.out.println("\n\nFor Employee Having same joining Dates:\n");
		//print those employees who has same joining dates.
		for (int i = 0; i < e.length; i++) {
			
			for (int j = i+1; j < e.length; j++)
			{
				if(e[i].getJoiningDate().getDay()==e[j].getJoiningDate().getDay() && 
						e[i].getJoiningDate().getMonth()==e[j].getJoiningDate().getMonth( )&& 
						e[i].getJoiningDate().getYear()==e[j].getJoiningDate().getYear())
				{
					System.out.println(e[i].toString() + "\n" + e[j].toString());
			
				}
					
			}
		}
	}
}
