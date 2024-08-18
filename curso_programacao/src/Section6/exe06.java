package Section6;

import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many tests do you wanna do?");
		int x = sc.nextInt();
		
		double weightedAverage = 0;
		for(int i = 0; i < x;i++) {
			
			System.out.println("Enter your three numbers:");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			weightedAverage = ((n1 * 2) + (n2 * 3) + (n3 * 5)) /10;	
			
			System.out.printf("%.1f%n", weightedAverage);
			System.out.println("-------------------------------------");
			
		}
		
		
		
		
		
		
		sc.close();
	}

}
