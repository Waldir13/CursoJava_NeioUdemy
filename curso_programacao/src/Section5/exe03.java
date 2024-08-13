package Section5;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int bigger, smaller;
	
		if(num1 > num2) {
			bigger = num1;
			smaller = num2;
		}
		else {
			bigger = num2;
			smaller = num1;
		}
		
		if(bigger % smaller == 0) {
			System.out.println("Numbers are multiple");
		}
		
		else {
			System.out.println("aren't multiple");
		}
		
		
		
		
		
		sc.close();

	}

}
