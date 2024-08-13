package Section5;

import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you salary: ");
		double sal = sc.nextDouble();
		
		double tax;
		
		if(sal >= 0.0 && sal  <= 2000.00) {
			System.out.println("tax-free");
		}
		
		else if(sal > 2000.00 && sal  <= 3000.00  ) {
			System.out.println( "$ " + (tax  = (sal  - 2000 * 0.08)));
		}
		
		else if(sal > 3000.00 && sal  <= 4500.00  ) {
			System.out.println( "$ " + (tax  = ((sal  - 3000) * 0.18 + 1000 * 0.08)));
		}
		
		else {
			System.out.println("$ " + (tax  = ((sal  - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08)));
		}
		
		
		
		sc.close();

	}

}
