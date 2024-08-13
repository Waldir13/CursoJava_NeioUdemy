package Section4;

import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int partCode01,partCode02,amount01,amount02;
		double price01,price02, totalPayable;
		
		partCode01 = sc.nextInt();
		amount01 = sc.nextInt();
		price01 = sc.nextDouble();
		System.out.println("--------------------------------\n");
		
		partCode02 = sc.nextInt();
		amount02 = sc.nextInt();
		price02 = sc.nextDouble();
		
		
		totalPayable = price01 * amount01 + price02 * amount02;
		
		System.out.println("--------------------------------\n");
		
		System.out.println("Amount to pay: " + totalPayable);
		
		sc.close();
	}

}
