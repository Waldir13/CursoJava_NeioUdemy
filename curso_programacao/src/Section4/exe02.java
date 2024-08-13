package Section4;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pi = Math.PI,r,a;
						
		r = sc.nextDouble();
		
		a = pi * Math.pow(r, 2);
		
		System.out.printf( "%.4f",a);
		
		
		
		
		
		
		
		sc.close();
	}

}
