package day21.ArrayasofObject;

public class StudentByConstructor {
	
	public static void showNames(StudentTest s[])
	{
		for (int i = 0; i < s.length; i++) {
			if (s[i].getMarks()>430)
			{
				System.out.println(s[i]);
			}
		}
	}
	public static void main(String[] args) {
		
	
	StudentTest stuarr[];
	stuarr=new StudentTest[5];//StudentTest stuarr[]=new StudentTest[5];
	
//	System.out.println(stuarr[0]);
//	System.out.println(stuarr[1]);

	stuarr[0]=new StudentTest(1,"Navin",450);
	stuarr[1]=new StudentTest(11,"Chaitanya",460);
	stuarr[2]=new StudentTest(1231,"Rakesh",420);
	stuarr[3]=new StudentTest(121,"Rushikesh",430);
	stuarr[4]=new StudentTest(143,"Bhagyesh",440);
	
//	stuarr[0].display();
	
	// By using forloop
	
	System.out.println("----------For Loop----------");
	for (int i = 0; i < stuarr.length; i++) {
		System.out.println(stuarr[i]);
	}
	
	System.out.println("----------Foreach Loop----------");
	for (StudentTest s:stuarr) 
	{
	System.out.println(s);	
	}
	
	System.out.println("----------By method----------");
	showNames(stuarr);
	}
}
