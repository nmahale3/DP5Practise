package lab.day2;

import java.util.Scanner;

public class MeenuBirthday {

	public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
		System.out.println("Enter the Age of Meenu");
		int age = dc.nextInt();
		int coins=age*age*age;
		System.out.println("At Meenu's "+age+" birthday She'll get "+coins+"");
		dc.close();
		//using Switch is Pending
	}

}
