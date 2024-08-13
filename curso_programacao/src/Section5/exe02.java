package Section5;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if( num % 2 == 0) {
			System.out.println(num + " It's Even");
		}
		
		else {
			System.out.println(num + " It's Odd");
		}
		
		
		
		
		sc.close();

	}

}
