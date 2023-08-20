package lab.day2;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Priciple Amount");
		double principleAmount = sc.nextDouble();
		System.out.println("Enter Rate of Interest");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Enter the time in Years");
		int time = sc.nextInt();
		double simpleInterest=(principleAmount*rateOfInterest*time)/100;
		System.out.println("simple ineterest for "+principleAmount+" is "+simpleInterest);
		sc.close();		
	}

}
