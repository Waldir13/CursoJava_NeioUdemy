package Section5;

import java.util.Scanner;

public class exe07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the X value:");
		double x = sc.nextDouble();
		System.out.println("Enter the Y value:");
		double y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println("origin");
		}
		
		else if(x == 0.0) {
			System.out.println("X axis");
		}
		
		else if(x == 0.0) {
			System.out.println("Y axis");
		}
		
		else if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		
		else if(x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		
		
		
		sc.close();
	}

}
