package day21.ArrayasInstanceVariable;

class Food {

	int foodid;
	String foodname;
	double foodprice;

	public Food(int foodid, String foodname, double foodprice) {

		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
	}
	public int getFoodid() {
		return foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public double getFoodprice() {
		return foodprice;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public void setFoodprice(double foodprice) {
		this.foodprice = foodprice;
	}
	@Override
	public String toString() {
		return "FoodsArrayObject [foodid=" + foodid + ", foodname=" + foodname + ", foodprice=" + foodprice + "]";
	}

}
public class FoodsArrayObject
{
	public static void main(String[] args) 
	{

		//Creating array object
		Food foods[];
		foods = new Food[5];
		//		System.out.println(foods[0]);
		//		display food

		System.out.println("------------Foods Details------------");
		for (int i = 0; i < foods.length; i++)
		{
			//			System.out.println(foods[i]);
		}

		for (Food f : foods) 
		{
			System.out.println(f);	
		}

		//		instantiation
		foods[0]=new Food(1,"Pav Bhaji",150);
		foods[1]=new Food(22,"Kaju Curry",140);
		foods[2]=new Food(123,"Shev Bhaji",120);
		foods[3]=new Food(132,"Veg Kolhapuri",180);
		foods[4]=new Food(145,"Paneer Butter Masala",130);

		//		Accessing
		//		case-1
		System.out.println(foods[0].foodid);
		System.out.println(foods[0].foodname);
		System.out.println(foods[0].foodprice);

		//		case-2
		System.out.println(foods[1].getFoodid());
		System.out.println(foods[1].getFoodname());
		System.out.println(foods[1].getFoodprice());

		//		case-3
		System.out.println("--------------Foods Details by loop--------------");

		for (int i = 0; i < foods.length; i++) 
		{
			System.out.println(foods[i].getFoodid());
			System.out.println(foods[i].getFoodname());
			System.out.println(foods[i].getFoodprice());
			System.out.println("----------------------------------------------");
		}

//		case-4
		System.out.println("--------------Foods Details by Foreach--------------");
	   	for (Food f : foods)
		{
		System.out.println(f.getFoodid());
		System.out.println(f.getFoodname());
		System.out.println(f.getFoodprice());
		System.out.println("----------------------------------");
		}
//		case-5
		System.out.println("-------------Food for toString-------------") ;
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
			System.out.println("--------------------------------------------");
		}
	}
}

