package day9.constructor;

public class Bike {
	
	String color;
	int bikeNumber;
	float avg;
	double price;
	
	Bike(String color,int bikeNumber,float avg)
	{
		this(120000);
		this.color=color;
		this.bikeNumber=bikeNumber;
		this.avg=avg;
		this.showBike();	
		
	}
	
	Bike(double price)
	{
		
		this.price=price;
	}
	
	void showBike() 
	{
		
	System.out.println("Bike color : "+this.color);
	System.out.println("Bike Number : "+this.bikeNumber);
	System.out.println("Bike Average : "+this.avg);
	System.out.println("Bike Price : "+this.price);
	
	}
	public static void main(String[] args) {
		
		Bike b= new Bike("red",1234,55.76f);
		
	}

}
