package Section6;

import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < x; i++) {
			
			int num = sc.nextInt();
			
			if(num >= 10 && num <= 20) {
				in++;
			}
			
			else {
				out++;
			}
		}
		
		System.out.println( in + " In");
		System.out.println( out + " Out");
		
		
		
		sc.close();
	}

}
