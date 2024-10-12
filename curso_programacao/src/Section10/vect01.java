package Section10;

import java.util.Scanner;

public class vect01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people do you want to include in the height calculation? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the height " + (i + 1) + ": ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("the average height is: %.2f%n ", avg);		
		System.out.println("==========================================");
		System.out.println("Have a nice day!");
		
		
		sc.close();
	}

}
