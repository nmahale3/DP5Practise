package day22.arrayofobject;

public class Students3 {

	private int roll;
	private String name;
	private int age;
	private float marks; 		
	public Students3(int roll, String name, int age, float marks) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	public static void main(String[] args) {
		Students3 st[] = new Students3[5];
		st[0] = new Students3(14,"Hina",18,50);
		st[1] = new Students3(15,"Meena",13,70);
		st[2] = new Students3(16,"Tina",32,80);
		st[3] = new Students3(17,"Lina",12,90);
		st[4] = new Students3(18,"Shila",20,90);
		for(int i = 0; i < st.length; i++)
		{
			System.out.println("Roll no: " + st[i].roll);
			System.out.println("Name: " + st[i].name);
			System.out.println(st[i].age);
			System.out.println(st[i].marks);
			System.out.println("\n-----------------------");
		}
		for(int j = 0; j <st.length; j++)
		{
			if(st[j].marks > 60 && st[j].age < 15)
			{
				System.out.println(st[j].toString());
				//System.out.println(st[j].toString());
			}
		}	
	}
}


