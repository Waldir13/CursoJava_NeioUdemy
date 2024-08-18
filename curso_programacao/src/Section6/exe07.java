package Section6;

import java.util.Scanner;

public class exe07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many division do you wanna do?");
		int x = sc.nextInt();
		
		for(int i=0;i < x;i++) {
			
			System.out.println("Enter the dividend and then the divisor:");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
						
			if(n2 == 0) {
				System.out.println("impossible division");
				System.out.println("----------------------");
			}
			
			else {
				
				double division = (double)n1 / n2;
				System.out.printf("%.1f\n",division );
				System.out.println("----------------------");
			}
			
		}
		
		
		
		
		sc.close();
	}

}
