package day16.astaction.assignment;
/*5)Create an abstract class equipment
 * with an implemented / concrete method fill and an abstract method mix.
 * Create a class Cement_mixer which is a type of equipment and implements method mix.
 * Now, add another method pour in the class Cement_mixer. In main method,(Interface)
a. Create an object of type Cement_mixer and call its fill, mix and pour methods.
b. Create an object of type Cement_mixer with reference variable of Equipment 
(Equipment e = new Cement_mixer). Check the methods available to e.

 * */
 abstract class Equipment
 {
	 //concrete method fill
	 void fill()
	 {
		 System.out.println("Equipment fill Method");
	 }
	 
	 //abstract method
	 abstract void mix();
	 
 }

class Cement_mixer extends Equipment
{

	@Override
	void mix() {
		System.out.println("Cement mixing");		
	}
	
	void pour()
	{
		System.out.println("Cement Pouring");
	}
	
}

public class Program5 {

	public static void main(String[] args) {
		Cement_mixer cm=new Cement_mixer();
		System.out.println("Cement Mixer class");
		cm.fill();
		cm.mix();
		cm.pour();
		
		Equipment e=new Cement_mixer();
		System.out.println("======================================\nAbstract Equipments Class");
		e.fill();
		e.mix(); 
	}
}
