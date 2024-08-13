package Section5;

import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------------");
		System.out.println("CODE	" + " iTEM      " + "         PRICE");
		System.out.println("01	" + " HOT DOG	" + "    $ 4.00");
		System.out.println("02	" + " BURGUER	" + "    $ 4.50");
		System.out.println("03	" + " PIZZA  	" + "    $ 10.00");
		System.out.println("04	" + " FRIED CHICKEN	   " + " $ 9.50");
		System.out.println("05	" + " APPLE PIE	" + "    $ 7.00");
		System.out.println("----------------------------------------\n");
		
		System.out.println("Are you ready to order?");
		int order = sc.nextInt();
		int howMany = sc.nextInt();
		double amount;
		
		
		if(order == 1) {
			amount = howMany * 4;
			System.out.println("The total for your order is $ " + amount);
		} 
		
		else if(order == 2) {
			amount = howMany * 4.5;
			System.out.println("The total for your order is $ " + amount);
		} 
		
		else if(order == 3) {
			amount = howMany * 10;
			System.out.println("The total for your order is $ " + amount);
		} 
		
		else if(order == 4) {
			amount = howMany * 9.5;
			System.out.println("The total for your order is $ " + amount);
		} 
		
		else if(order == 5) {
			amount = howMany * 7;
			System.out.println("The total for your order is $ " + amount);
		} 
		sc.close();

	}

}
