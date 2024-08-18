package Section6;

import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to find its divisors:");
		int x = sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			if( x % i == 0) {
				System.out.println(i);				
			}
		}
		
		
		sc.close();

	}

}
