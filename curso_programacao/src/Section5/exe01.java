package Section5;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int num = sc.nextInt();
			
			if(num >= 0) {
				System.out.println("Isn't negative");
			}
			
			else {
				System.out.println("Negative");
			}
		
		
		
		
		sc.close();
	}

}
