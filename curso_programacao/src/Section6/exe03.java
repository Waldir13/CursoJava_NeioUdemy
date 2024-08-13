package Section6;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Enter 1 for Gas | 2 for Alcohol | 3 for Diesel Oil | 4 for Exit");
		System.out.println("---------------------------------------------------------------------\n");
		System.out.println("what fuel did you fill:");
		int fuel = sc.nextInt();
		
		int gas = 0;
		int alcohol = 0;
		int dieselOil = 0;
		
		while(fuel != 4) {
			
			if(fuel == 1) {
				gas++;
			}
			
			if(fuel == 2) {
				alcohol++;
			}
			
			if(fuel == 3) {
				dieselOil++;
			}
			
			System.out.println("what fuel did you fill:");
			fuel = sc.nextInt();
		}
		
		System.out.println("thank you!");
		System.out.println("Gas: " + gas);
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Diesel Oil " + dieselOil);
		
		
		
		
		
		
		sc.close();
	}

}
