package Section10.application;

import java.util.Scanner;
import Section10.entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many products do you sold? ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Enter the product " + (i + 1) + ":");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter your price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("\r\n"
				+ "Your sales average was:: %.2f%n ", avg);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
