package Section5;

import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//([0,25], (25,50], (50,75], (75,100]
		
		System.out.println("Enter a number: ");				
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 25) {
			System.out.println("range of numbers [0,25]");
		}
		
		else if(num > 25 && num <= 50) {
			System.out.println("range of numbers [25,50]");
		}
		
		else if(num > 50 && num <= 75) {
			System.out.println("range of numbers [50,75]");
		}
		
		else if(num > 75 && num <= 100) {
			System.out.println("range of numbers [75,100]");
		}
		
		else {
			System.out.println("outside the range of numbers");
		}
		
		
		
		
		
		sc.close();

	}

}
