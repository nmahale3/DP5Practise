package day5.whileloop;

import java.util.Scanner;

public class Chocolates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Chocolates");
		int rs = sc.nextInt();
		sc.close();
		int chocolates=0;
		for (int i = 1; i <=rs ; i++) {
			chocolates++;
			if(chocolates==3) {
				chocolates++;
			}
			
		}
		System.out.println(rs+" rs then she got "+chocolates+" chocolates");
	}

}
