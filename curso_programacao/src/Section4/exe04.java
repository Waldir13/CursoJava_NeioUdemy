package Section4;

import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int empNum, hours;
		double hourlyWage;
		
		empNum = sc.nextInt();
		hours = sc.nextInt();
		hourlyWage = sc.nextDouble();
		
		System.out.println("Number = " + empNum);
		System.out.println("Salary = " + hourlyWage * hours);
		
		
		
		
		sc.close();

	}

}
